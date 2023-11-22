package com.valtech.training.assignmentHib.model;

import com.valtech.training.assignmentHib.entities.Department;
import com.valtech.training.assignmentHib.entities.Employee;

public class EmployeeModel {
	
	private int id;
	private String name;
	private int age;
	private int experience;
	private int seniority;
	private double salary;
	private Department department;
	
	public EmployeeModel(Employee e) {
		this.id=e.getId();
		this.name=e.getName();
		this.age=e.getAge();
		this.experience=e.getExperience();
		this.seniority=e.getSeniority();
		this.salary=e.getSalary();
		this.department=e.getDepartment();
	}
	
	
	public EmployeeModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee getEmployee() {
		return new Employee(id,name,age,experience,seniority,salary,department);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getSeniority() {
		return seniority;
	}

	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
	

}