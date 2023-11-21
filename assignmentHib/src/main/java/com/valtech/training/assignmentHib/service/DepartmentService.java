package com.valtech.training.assignmentHib.service;

import java.util.List;

import com.valtech.training.assignmentHib.entities.Department;

public interface DepartmentService {
	
	Department createDepartment(Department department);
	Department updateDepartment(Department department);
	void deleteDerpartment(int deptId);
	List<Department> getAllDepartmet();
	Department getDepartment(int deptId);
//	long countDepartment();

}
