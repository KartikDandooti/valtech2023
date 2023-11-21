package com.valtech.training.assignmentHib.model;

import com.valtech.training.assignmentHib.entities.Department;

public class DepartmentModel {

	private int deptId;
	private String deptName;
	private String deptLocation;

	public DepartmentModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DepartmentModel(Department department) {
		this.deptId = department.getDeptId();
		this.deptName = department.getDeptName();
		this.deptLocation = department.getDeptLocation();
	}

	public Department getDepratment() {
		return new Department( deptId,deptName,deptLocation);
		
	}
	public int getDeptId() {  
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptLocation() {
		return deptLocation;
	}

	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}
	
	

}
