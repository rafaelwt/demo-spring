package com.rwt.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.rwt.demo.validation.annotations.FieldNotEmpty;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private Long id;

    // @NotBlank(message = "{employee.name.notblank}")
    @FieldNotEmpty(message = "{validation.notEmpty}", field = "{field.personalName}")
    private String name;

    @NotBlank(message = "{employee.firstname.notblank}")
    @Size(min = 2, max = 50, message = "{employee.firstname.size}")
    private String firstName;

    @NotBlank(message = "{employee.lastname.notblank}")
    @Size(min = 2, max = 50, message = "{employee.lastname.size}")
    private String lastName;

    @NotBlank(message = "{employee.address.notblank}")
    private String address;

    @NotNull(message = "{employee.department.notnull}")
    private Long departmentId;
}