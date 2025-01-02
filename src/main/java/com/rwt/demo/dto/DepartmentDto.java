package com.rwt.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {
    private Long id;
    @NotBlank(message = "El nombre del departamento no puede estar vacío")
    private String departmentName;
    @NotBlank(message = "La descripción del departamento no puede estar vacía")
    private String departmentDescription;
}
