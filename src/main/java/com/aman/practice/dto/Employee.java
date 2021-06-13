package com.aman.practice.dto;

import javax.persistence.*;
import java.io.Serializable;

/*
* JSON Sample:
* {
  "empAddress": {"addressId":12,"address1":"AAmm", "address2": "jjjott", "city":"Gur","pincode":12},
  "empDept": {"deptId":12,"dname":"AAmm", "deptHead": "jjjott"},
      "empId": 234,
      "empName": "Amanjot"
}
* */


@Entity
@Table(name = "employee")
public class Employee implements Serializable {

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

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public Department getEmpDept() {
        return empDept;
    }

    public Address getEmpAddress() {
        return empAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDept=" + empDept +
                ", empAddress=" + empAddress +
                '}';
    }
}
