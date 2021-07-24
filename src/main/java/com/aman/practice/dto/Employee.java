package com.aman.practice.dto;

import lombok.Data;
import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
* JSON Sample:
{
  "empName": "Amanjot"
  "empAddress": {"address1":"B9-501", "address2": "Experion Heartsong", "city":"Guragon","pincode":122001},
  "empDept": [{"dname":"Maths", "deptHead": "Amanjot"},{","dname":"Computer Science", "deptHead": "Amanjot"}]
}
*
*/


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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "empDept")
    private List<Department> empDept = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "empAddress")
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
