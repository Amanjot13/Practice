package com.aman.practice.service;

import com.aman.practice.dto.Employee;
import com.aman.practice.dto.EmployeeBuild;
import com.aman.practice.pojo.EmployeePojo;

import java.util.List;

public interface IEmpService<E> {
    public List<E> getEmployeeDetails();

    public boolean insertEmployeeDetails(Employee employee);
}
