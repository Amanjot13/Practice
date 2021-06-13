package com.aman.practice.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "department")
public class Department implements Serializable {

    @Id
    private int deptId;

    @Column(name = "deptName")
    @JsonProperty("dname")
    private String deptName;

    @Column(name = "deptHead")
    private String deptHead;

    public int getDeptId() {
        return deptId;
    }

    public String getDeptHead() {
        return deptHead;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", deptHead='" + deptHead + '\'' +
                '}';
    }
}
