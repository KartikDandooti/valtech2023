package com.valtech.training.assignmentHib.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valtech.training.assignmentHib.entities.Employee;
import com.valtech.training.assignmentHib.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public Employee updateEmploye(Employee employee) {
		// TODO Auto-generated method stub
		
		return employeeRepo.save(employee);
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return employeeRepo.getReferenceById(id);
	}

	@Override
	public void deleteEmployee(int id) {
		employeeRepo.deleteById(id);
	}
	
	

}
