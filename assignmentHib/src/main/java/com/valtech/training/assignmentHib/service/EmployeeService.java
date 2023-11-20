package com.valtech.training.assignmentHib.service;

import java.util.List;

import com.valtech.training.assignmentHib.entities.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	Employee updateEmploye(Employee employee);
	Employee getEmployee(int id);
	List<Employee> getAllEmployee();
	void deleteEmployee(int id);
	

}
