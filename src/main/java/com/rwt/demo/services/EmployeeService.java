package com.rwt.demo.services;

import com.rwt.demo.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    // EmployeeDto getEmployeeById(Long employeeId);
    // List<EmployeeDto> getAllEmployees();
    // EmployeeDto updateEmployee(Long employeeId, EmployeeDto employeeDto);
    // void deleteEmployee(Long employeeId);
}
