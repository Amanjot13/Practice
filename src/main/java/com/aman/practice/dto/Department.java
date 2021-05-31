package com.aman.practice.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {

    @Id
    private int deptId;

    @Column(name = "deptName")
    private String deptName;

    @Column(name = "deptHead")
    private String deptHead;

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", deptHead='" + deptHead + '\'' +
                '}';
    }
}
