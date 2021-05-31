package com.aman.practice.service;

import com.aman.practice.dto.EmployeeBuild;

import java.util.List;

public interface IEmpService<E> {
    public List<E> getEmployeeDetails();
}
