package com.aman.practice.dto;

import lombok.Data;
import org.hibernate.annotations.Generated;

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
@Data
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "empId")
    private int empId;

    @Column(name="empName")
    private String empName;

    @OneToOne(cascade = CascadeType.ALL)
  //  @JoinColumn(name = "empDept", referencedColumnName = "deptId")
    private Department empDept;

    @OneToOne(cascade = CascadeType.ALL)
  //  @JoinColumn(name = "empAddress", referencedColumnName = "addressId")
    private Address empAddress;

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
