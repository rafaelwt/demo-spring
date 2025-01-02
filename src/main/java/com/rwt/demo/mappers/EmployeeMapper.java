package com.rwt.demo.mappers;

import com.rwt.demo.dto.EmployeeDto;
import com.rwt.demo.entities.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(employee.getId(),
                employee.getName(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getAddress(),
                employee.getDepartment().getId());
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setId(employeeDto.getId());
        employee.setName(employeeDto.getName());
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setAddress(employeeDto.getAddress());
        return employee;
    }
}