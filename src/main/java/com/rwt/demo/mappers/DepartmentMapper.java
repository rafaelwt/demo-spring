package com.rwt.demo.mappers;

import com.rwt.demo.dto.DepartmentDto;
import com.rwt.demo.entities.Department;

public class DepartmentMapper {

    // Convertir la Entidad JPA Department en un Department DTO

    public static DepartmentDto mapToDepartmentDto(Department department) {

        return new DepartmentDto(

                department.getId(),

                department.getDepartmentName(),

                department.getDepartmentDescription()

        );

    }

    // Convertir el Department DTO en una Entidad JPA Department

    public static Department mapToDepartment(DepartmentDto departmentDto) {

        return new Department(

                departmentDto.getId(),

                departmentDto.getDepartmentName(),

                departmentDto.getDepartmentDescription()

        );

    }

}