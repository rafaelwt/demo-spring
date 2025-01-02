package com.rwt.demo.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rwt.demo.dto.ReportDto;

@Repository
public interface ReportRepository {

    List<ReportDto> getEmployeesByDepartment(Long depId);
}
