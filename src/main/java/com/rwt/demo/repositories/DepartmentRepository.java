package com.rwt.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rwt.demo.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
