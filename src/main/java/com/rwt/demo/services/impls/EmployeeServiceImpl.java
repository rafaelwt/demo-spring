package com.rwt.demo.services.impls;

import com.rwt.demo.dto.EmployeeDto;
import com.rwt.demo.entities.Employee;
import com.rwt.demo.mappers.EmployeeMapper;
import com.rwt.demo.repositories.EmployeeRepository;
import com.rwt.demo.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    // Inyect el EmployeeRepository
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

}
