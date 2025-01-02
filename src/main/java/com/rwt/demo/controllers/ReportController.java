package com.rwt.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rwt.demo.dto.ReportDto;
import com.rwt.demo.services.ReportService;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/employees/{depId}")
    public List<ReportDto> getEmployeesByDepartment(@PathVariable Long depId) {
        return reportService.getEmployeesByDepartment(depId);
    }
}
