package com.valtech.training.assignmentHib.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.valtech.training.assignmentHib.entities.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
	@Query(value = "from Employee where department.deptId=?1")
    List<Employee> getAllEmployeesByDeptId(int deptId);
	
//	List<Employee> findAllEmployeesByDepartmentId(int deptId);

}
