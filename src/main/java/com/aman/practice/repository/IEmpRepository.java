package com.aman.practice.repository;

import com.aman.practice.dto.Employee;
import com.aman.practice.dto.EmployeeBuild;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IEmpRepository<E> {

    public List<E> getEmployeeDetails();

}
