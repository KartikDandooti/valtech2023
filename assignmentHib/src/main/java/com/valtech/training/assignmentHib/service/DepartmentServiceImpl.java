package com.valtech.training.assignmentHib.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valtech.training.assignmentHib.entities.Department;
import com.valtech.training.assignmentHib.repo.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	DepartmentRepo departmentRepo;
	@Override
	public Department createDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepo.save(department);
	}

	@Override
	public Department updateDepartment(Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDerpartment(int deptId) {
		departmentRepo.deleteById(deptId);
		
	}

	@Override
	public List<Department> getAllDepartmet() {
		// TODO Auto-generated method stub
		return departmentRepo.findAll();
	}

	@Override
	public Department getDepartment(int deptId) {
		// TODO Auto-generated method stub
		return departmentRepo.getReferenceById(deptId);
	}
//
//	@Override
//	public long countDepartment() {
//		// TODO Auto-generated method stub
//		return departmentRepo.count();
//	}

}
