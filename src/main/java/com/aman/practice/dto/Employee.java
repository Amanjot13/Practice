package com.aman.practice.dto;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    private int empId;

    @Column(name="empName")
    private String empName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "empDept", referencedColumnName = "deptId")
    private Department empDept;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "empAddress", referencedColumnName = "addressId")
    private Address empAddress;

}
