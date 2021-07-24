package com.aman.practice.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "department")
@Data
public class Department implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int deptId;

    @Column(name = "deptName")
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
