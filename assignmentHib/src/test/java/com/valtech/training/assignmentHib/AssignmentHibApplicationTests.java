package com.valtech.training.assignmentHib;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.valtech.training.assignmentHib.components.HelloWorld;
import com.valtech.training.assignmentHib.entities.Employee;
import com.valtech.training.assignmentHib.service.EmployeeService;

@SpringBootTest
class AssignmentHibApplicationTests {

	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	HelloWorld helloWorld;
	@Test
	void contextLoads() {
		assertEquals("Hello", helloWorld.name());
	}
	
	@Test
	void testEmployee() {
		employeeService.saveEmployee(new Employee("kartik", 23, 1, 1, 40000));
		employeeService.saveEmployee(new Employee("pradeep", 22, 1, 1, 44000));
		assertEquals(2, employeeService.getAllEmployee().size());
	}

}
