package com.aman.practice.service;

import com.aman.practice.configurer.RepositoryType;
import com.aman.practice.dto.Address;
import com.aman.practice.dto.Department;
import com.aman.practice.dto.Employee;
import com.aman.practice.dto.EmployeeBuild;
import com.aman.practice.repository.EmployeeJPARepository;
import com.aman.practice.repository.IEmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("employeeJPAService")
public class EmployeeJPAService implements IEmpService<Employee> {

    @RepositoryType("EmployeeJPARepository")
    @Autowired
    EmployeeJPARepository employeeJPARepository;

    @Override
    public List<Employee> getEmployeeDetails() {

        Department d1 = new Department();
        d1.setDeptName("Maths");
        d1.setDeptHead("Aman");

        Address a1 = new Address();
        a1.setAddress1("ABC");
        a1.setAddress2("XYZ");
        a1.setPincode(123);
        a1.setCity("Gurgaon");

        Employee e1 = new Employee();
        e1.setEmpName("Aman");
        e1.setEmpDept(d1);
        e1.setEmpAddress(a1);

        employeeJPARepository.save(e1);


        List<Employee> employeeList=employeeJPARepository.findAll();
        return employeeList;
    }
}
