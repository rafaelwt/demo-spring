package com.rwt.demo.repositories;

import com.rwt.demo.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// Primer parametro la clase de la entidad y el segundo es el tipo de datos del id
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
