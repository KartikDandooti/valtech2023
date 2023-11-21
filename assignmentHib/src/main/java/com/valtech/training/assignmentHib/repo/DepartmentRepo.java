package com.valtech.training.assignmentHib.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.training.assignmentHib.entities.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Integer>{

}
