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

import com.valtech.training.assignmentHib.model.EmployeeModel;
import com.valtech.training.assignmentHib.service.EmployeeService;


@Controller
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@RequestMapping(path = "/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/hello")
	public String helloTrail() {
		
		return "hello";
	}
	
	@GetMapping("/list")
	public String listEmployee(Model model) {
		model.addAttribute("employee",employeeService.getAllEmployee().stream().
				map(emp-> new EmployeeModel(emp))
				.collect(Collectors.toList()));
		return "employee/list";
		
	}
	@GetMapping("/edit")
	public String editEmployee(@RequestParam("id") int id,Model model) {
		model.addAttribute("employee",new EmployeeModel(employeeService.getEmployee(id)));
		return "employee/edit";
	}
	
	@PostMapping(path="/save",params = "cancel")
	public String canelEditEmployee(Model model) {
		model.addAttribute("employee",employeeService.getAllEmployee().
				stream().map(emp -> new EmployeeModel(emp)).collect(Collectors.toList()));
		return "employee/list";
		
	}
	
	@PostMapping(path="/save",params = "submit")
	public String saveEmployee(@ModelAttribute EmployeeModel employeeModel,Model model) {
		employeeService.saveEmployee(employeeModel.getEmployee());
		model.addAttribute("employee",employeeService.getAllEmployee().
				stream().map(emp -> new EmployeeModel(emp)).collect(Collectors.toList()));
		
		
		return "employee/list";
		
	}
	@GetMapping("/new")
	public String newEmployee(Model model) {
		model.addAttribute("employee",new EmployeeModel());
		return "employee/edit";
	}
	
	@GetMapping("/delete")
	public String deleteEmpployee(@RequestParam("id") int id,Model model) {
		employeeService.deleteEmployee(id);
		model.addAttribute("employee",employeeService.getAllEmployee().
				stream().map(emp -> new EmployeeModel(emp)).collect(Collectors.toList()));
		
		return "employee/list";
	}


}
