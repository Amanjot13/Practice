package com.aman.practice.dto.mappers;

import com.aman.practice.dto.AddressBuild;
import com.aman.practice.dto.DepartmentBuild;
import com.aman.practice.dto.EmployeeBuild;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<EmployeeBuild>, EmployeeRowMapper1 {

    @Override
    public EmployeeBuild mapRow(ResultSet rs, int rowNum) throws SQLException {

        AddressBuild addbuild = new AddressBuild.AddressBuilder()
                .withAdressId(rs.getInt("addressId"))
                .withAdress1(rs.getString("address1"))
                .withAdress2(rs.getString("address2"))
                .withCity(rs.getString("city"))
                .withPinCode(rs.getInt("pincode")).build();

        DepartmentBuild deptBuild = new DepartmentBuild.DepartmentBuilder()
                .withDeptId(rs.getInt("deptId"))
                .withDeptName(rs.getString("deptName"))
                .withDeptHead(rs.getString("deptHead")).build();
        EmployeeBuild empBuild = new EmployeeBuild.EmployeeBuilder()
                .withEmpId(rs.getInt("empId"))
                .withEmpName(rs.getString("empName"))
                .withEmpAddress(addbuild)
                .withEmpDept(deptBuild).buid();
        return empBuild;

    }
}