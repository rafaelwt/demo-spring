DELIMITER $$

-- Eliminamos el SP si ya existe
DROP PROCEDURE IF EXISTS sp_get_employees_by_department $$

-- Creamos el SP
CREATE PROCEDURE sp_get_employees_by_department(
    IN depId BIGINT
)
BEGIN
    SELECT
        e.id,
        e.employee_name as name,
        d.department_name as department
    FROM employees e
    INNER JOIN departments d on e.department_id = d.id
    WHERE e.department_id = depId;
END $$

DELIMITER ;
