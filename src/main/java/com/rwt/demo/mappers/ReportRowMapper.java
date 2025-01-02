package com.rwt.demo.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.NonNull;

import com.rwt.demo.dto.ReportDto;

public class ReportRowMapper implements RowMapper<ReportDto> {
    @Override
    public ReportDto mapRow(@NonNull ResultSet rs, int rowNum) throws SQLException {
        ReportDto dto = new ReportDto();
        dto.setId(rs.getLong("id"));
        dto.setName(rs.getString("name"));
        dto.setDepartment(rs.getString("department"));
        return dto;
    }
}