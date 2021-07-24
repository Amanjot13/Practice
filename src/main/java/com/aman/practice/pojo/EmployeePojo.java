package com.aman.practice.pojo;

import com.aman.practice.dto.Address;
import com.aman.practice.dto.Department;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;

/*
{
  "empAddress": {
    "address1": "B9-501",
    "address2": "Heartsong",
    "city": "Gurgaon",
    "pincode": 122001
  },
  "empDept": [
    {
      "deptHead": "Aman",
      "dname": "Maths"
    },
    {
      "deptHead": "Harman",
      "deptName": "CSE"
    }
  ],
  "empName": "Amanjot"
}


* */

@Data
public class EmployeePojo implements Serializable {

    private int empId;

    private String empName;

    private List<Department> empDept = new ArrayList<>();

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
