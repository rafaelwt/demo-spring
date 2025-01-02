package com.rwt.demo.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rwt.demo.dto.ReportDto;
import com.rwt.demo.repositories.ReportRepository;
import com.rwt.demo.services.ReportService;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private ReportRepository reportRepository;

    @Override
    public List<ReportDto> getEmployeesByDepartment(Long depId) {
        return reportRepository.getEmployeesByDepartment(depId);
    }
}
