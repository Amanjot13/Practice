package com.aman.practice.repository;

import com.aman.practice.configurer.RepositoryType;
import com.aman.practice.dto.EmployeeBuild;
import com.aman.practice.dto.mappers.EmployeeRowMapper;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@RepositoryType("EmployeeRepository")
@Repository
@NoArgsConstructor
public class EmployeeRepository implements IEmpRepository<EmployeeBuild> {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public EmployeeRepository(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static final String SELECT_EMPLOYEE = "select e.empId as empId," +
            "e.empName as empName," +
            "a.address1 as address1," +
            "a.addressId as addressId," +
            "a.address2 as address2, " +
            "a.city as city," +
            "a.pincode as pincode," +
            "d.deptId as deptId, " +
            "d.deptName as deptName, " +
            "d.deptHead as deptHead " +
            "from employee e, department d," +
            " address a where e.empAddress=a.addressId and d.empDept=e.empId";

    public List<EmployeeBuild> getEmployeeDetails() {
        System.out.println("EmployeeRepository");
        List<EmployeeBuild> eb = jdbcTemplate.query(SELECT_EMPLOYEE, new EmployeeRowMapper());
        eb.stream().filter(x-> ! x.getEmpName().equals("Aman")).forEach(x -> System.out.println(x.getEmpName()));
        return eb;
    }

}
