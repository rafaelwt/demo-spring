package com.rwt.demo.repositories.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.rwt.demo.dto.ReportDto;
import com.rwt.demo.mappers.ReportRowMapper;
import com.rwt.demo.repositories.ReportRepository;

@Repository
public class ReportRepositoryImpl implements ReportRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<ReportDto> getEmployeesByDepartment(Long depId) {
        String sql = "{call sp_get_employees_by_department(?)}";

        // 1. Definir los parámetros para la llamada al SP
        PreparedStatementSetter pss = ps -> {
            ps.setLong(1, depId);
        };
        // 2. Mapear el resultado de la consulta a un ReportDto
        RowMapper<ReportDto> rowMapper = new ReportRowMapper();
        // 3. Ejecutar la consulta
        List<ReportDto> resultados = jdbcTemplate.query(sql, pss, rowMapper);
        return resultados;
    }
}
