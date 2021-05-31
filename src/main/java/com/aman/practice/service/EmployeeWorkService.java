package com.aman.practice.service;

import com.aman.practice.configurer.RepositoryType;
import com.aman.practice.dto.Employee;
import com.aman.practice.dto.EmployeeBuild;
import com.aman.practice.repository.IEmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("employeeWorkService")
public class EmployeeWorkService implements IEmpService<Employee> {

    @RepositoryType("EmployeeWorkRepository")
    @Autowired
    IEmpRepository employeeWorkRepository;

    @Override
    public List<Employee> getEmployeeDetails() {
        System.out.println(employeeWorkRepository);
        System.out.println(employeeWorkRepository);
        return employeeWorkRepository.findAll();
    }
}
