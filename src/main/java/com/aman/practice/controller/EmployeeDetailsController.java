package com.aman.practice.controller;

import com.aman.practice.dto.Employee;
import com.aman.practice.dto.EmployeeBuild;
import com.aman.practice.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/practice")
public class EmployeeDetailsController {

    @Qualifier("employeeJPAService")
    @Autowired
    private IEmpService employeeJPAService;

    @Qualifier("employeeService")
    @Autowired
    private IEmpService employeeService;

    @GetMapping("/employee")
    public List<String> getAllEmployees(){

        List<EmployeeBuild> eb= employeeService.getEmployeeDetails();
        return eb.stream().map(x->x.getEmpName()).collect(Collectors.toList());
    }

    @GetMapping("/employeeJPA")
    public List<String> getAllEmployeesJPA(){

        List<Employee> eb= employeeJPAService.getEmployeeDetails();
        return eb.stream().map(x->x.getEmpName()).collect(Collectors.toList());
    }

    @GetMapping
    public String check(){
        return "OKKKKKK !!!";
    }
}
