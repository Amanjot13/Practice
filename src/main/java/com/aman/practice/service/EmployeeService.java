package com.aman.practice.service;

import com.aman.practice.configurer.RepositoryType;
import com.aman.practice.dto.EmployeeBuild;
import com.aman.practice.repository.IEmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service("employeeService")
public class EmployeeService implements IEmpService<EmployeeBuild> {

    @RepositoryType("EmployeeRepository")
    @Autowired
    IEmpRepository employeeRepository;

    @Override
    public List<EmployeeBuild> getEmployeeDetails() {
        System.out.println(employeeRepository);
        List<EmployeeBuild> employees = employeeRepository.getEmployeeDetails();
        return employees;
    }
}
