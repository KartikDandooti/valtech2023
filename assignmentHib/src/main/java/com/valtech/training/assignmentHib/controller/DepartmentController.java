package com.valtech.training.assignmentHib.controller;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.valtech.training.assignmentHib.model.DepartmentModel;
import com.valtech.training.assignmentHib.model.EmployeeModel;
import com.valtech.training.assignmentHib.service.DepartmentService;
import com.valtech.training.assignmentHib.service.EmployeeService;

@Controller
@RequestMapping(path = "/department")
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/list")
	public String listAllDepartment(Model model) {
		model.addAttribute("department",departmentService.getAllDepartmet().stream().
				map(dept ->new DepartmentModel(dept)).collect(Collectors.toList()));
		
		return "department/list";
	}
	
	@GetMapping("/edit")
	public String editDepartment(@RequestParam("deptId") int deptId,Model model) {
		model.addAttribute("department",new DepartmentModel(departmentService.getDepartment(deptId)));
		
		return "department/edit";
	}
	
	@PostMapping(path = "/save",params = "submit")
	public String saveEditedDepartment(@ModelAttribute DepartmentModel departmentModel,Model model) {
		departmentService.createDepartment(departmentModel.getDepratment());
		model.addAttribute("department",departmentService.getAllDepartmet().stream().
				map(dept ->new DepartmentModel(dept)).collect(Collectors.toList()));
		
		return "department/list";
	}
	@PostMapping(path="/save",params = "cancel")
	public String cancelEditDepartment(Model model) {
		model.addAttribute("department",departmentService.getAllDepartmet().stream().
				map(dept ->new DepartmentModel(dept)).collect(Collectors.toList()));
		return "department/list";
	}
	
	@GetMapping("/delete")
	public String deleteDepartment(Model model,@RequestParam("deptId") int deptId) {
		departmentService.deleteDerpartment(deptId);
		model.addAttribute("department",departmentService.getAllDepartmet().stream().
				map(dept ->new DepartmentModel(dept)).collect(Collectors.toList()));
		return "department/list";
	}
	
	@GetMapping("/new")
	public String newDepartment(Model model) {
		model.addAttribute("department",new DepartmentModel());
		return "department/edit";
	}
	
	@GetMapping("/getEmployees")
	public String getAllEmployee(Model model,@RequestParam("deptId") int deptId) {
		model.addAttribute("employee",employeeService.getAllEmployeesByDeptId(deptId).stream()
				.map(emp -> new EmployeeModel(emp)).collect(Collectors.toList()));
		return "department/getEmployeeDept";
		
	}
	


}
