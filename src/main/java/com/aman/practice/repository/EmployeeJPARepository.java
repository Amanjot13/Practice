package com.aman.practice.repository;

import com.aman.practice.configurer.RepositoryType;
import com.aman.practice.dto.Employee;
import com.aman.practice.dto.EmployeeBuild;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryType("EmployeeJPARepository")
@Repository
public interface EmployeeJPARepository extends JpaRepository<Employee, Long> {

}
