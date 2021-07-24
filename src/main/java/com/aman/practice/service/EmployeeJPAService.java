package com.aman.practice.service;

import com.aman.practice.configurer.RepositoryType;
import com.aman.practice.dto.Address;
import com.aman.practice.dto.Department;
import com.aman.practice.dto.Employee;
import com.aman.practice.dto.EmployeeBuild;
import com.aman.practice.pojo.EmployeePojo;
import com.aman.practice.repository.EmployeeJPARepository;
import com.aman.practice.repository.IEmpRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service("employeeJPAService")
public class EmployeeJPAService implements IEmpService<Employee> {


    @RepositoryType("EmployeeJPARepository")
    @Autowired
    EmployeeJPARepository employeeJPARepository;

    @Override
    public List<Employee> getEmployeeDetails() {

        List<Employee> employeeList=employeeJPARepository.findAll();
        return employeeList;
    }

    @Override
    public boolean insertEmployeeDetails(Employee employee) {


        employeeJPARepository.save(employee);
        return true;
    }
}
