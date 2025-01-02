package com.rwt.demo.services;

import java.util.List;

import com.rwt.demo.dto.ReportDto;

public interface ReportService {
    List<ReportDto> getEmployeesByDepartment(Long depId);
}
