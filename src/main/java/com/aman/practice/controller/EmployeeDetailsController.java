package com.aman.practice.controller;

import com.aman.practice.dto.Department;
import com.aman.practice.dto.Employee;
import com.aman.practice.pojo.DepartmentPojo;
import com.aman.practice.pojo.EmployeePojo;
import com.aman.practice.service.IEmpService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Destination;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/practice")
public class EmployeeDetailsController {

    @Autowired
    ModelMapper modelMapper;

    @Qualifier("employeeJPAService")
    @Autowired
    private IEmpService employeeJPAService;

    @Qualifier("employeeService")
    @Autowired
    private IEmpService employeeService;

    @GetMapping("/employee")
    public List<String> getAllEmployees(){
        List<Employee> eb= employeeService.getEmployeeDetails();
        return eb.stream().map(x->x.getEmpName()).collect(Collectors.toList());
    }

    @PostMapping("/employeeJPA")
    public boolean insertEmployeesJPA(@RequestBody EmployeePojo employee){
        System.out.println("here"+employee);

        modelMapper.typeMap(DepartmentPojo.class, Department.class).addMappings(mapper -> {
            mapper.map(src -> src.getDeptName(),
                    Department::setDeptName);
        });

        Employee emp = modelMapper.map(employee, Employee.class);
        boolean inserted = employeeJPAService.insertEmployeeDetails(emp);
        return inserted;
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
