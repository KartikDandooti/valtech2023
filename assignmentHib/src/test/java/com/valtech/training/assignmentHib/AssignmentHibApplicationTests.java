package com.valtech.training.assignmentHib;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.valtech.training.assignmentHib.components.HelloWorld;
import com.valtech.training.assignmentHib.entities.Department;
import com.valtech.training.assignmentHib.entities.Employee;
import com.valtech.training.assignmentHib.service.DepartmentService;
import com.valtech.training.assignmentHib.service.EmployeeService;

@SpringBootTest
class AssignmentHibApplicationTests {

	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	DepartmentService departmentService;
	
	@Autowired
	HelloWorld helloWorld;
//	@Test
//	void contextLoads() {
//		assertEquals("Hello", helloWorld.name());
//	}
//	
	@Test
	void testEmployee() {
//		employeeService.saveEmployee(new Employee("kartik", 23, 1, 1, 40000,
//				departmentService.createDepartment(new Department("UI/UX","2nd floor"))));
//		
//		employeeService.saveEmployee(new Employee("pradeep", 22, 1, 1, 44000,
//				departmentService.createDepartment(new Department("LV","3nd floor"))));
		assertEquals(1, employeeService.getAllEmployeesByDeptId(1).size());
		
	}
//	@Test
//	void testDepartment() {
//		departmentService.createDepartment(new Department("UI/UX","2nd floor"));
//		assertEquals(2, departmentService.getAllDepartmet().size());
//		
//	}

}
