package com.aman.practice.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

public class EmployeeBuild implements Serializable {

    private EmployeeBuild(EmployeeBuilder eb){
        this.empId=eb.empId;
        this.empName=eb.empName;
        this.empAddress=eb.empAddress;
        this.empDept=eb.empDept;
    }

    private final int empId;

    private final String empName;

    private final DepartmentBuild empDept;

    private final AddressBuild empAddress;

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public AddressBuild getEmpAddress() {
        return empAddress;
    }

    public DepartmentBuild getEmpDept() {
        return empDept;
    }

    @Override
    public String toString() {
        return "EmployeeBuild{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDept=" + empDept +
                ", empAddress=" + empAddress +
                '}';
    }

    public static class EmployeeBuilder{
        private  int empId;

        private  String empName;

        private  DepartmentBuild empDept;

        private  AddressBuild empAddress;


        public EmployeeBuilder withEmpId(int empId){
            this.empId=empId;
            return this;
        }

        public EmployeeBuilder withEmpName(String empName){
            this.empName=empName;
            return this;
        }
        public EmployeeBuilder withEmpAddress(AddressBuild empAddress){
            this.empAddress=empAddress;
            return this;
        }
        public EmployeeBuilder withEmpDept(DepartmentBuild empDept){
            this.empDept=empDept;
            return this;
        }

        public EmployeeBuild buid(){
            EmployeeBuild eb = new EmployeeBuild(this);
            return eb;
        }

    }

}
