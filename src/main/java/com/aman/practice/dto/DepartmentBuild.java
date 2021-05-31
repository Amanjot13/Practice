package com.aman.practice.dto;

import java.io.Serializable;

public class DepartmentBuild implements Serializable {

    private int deptId;

    private String deptName;

    private String deptHead;

    private DepartmentBuild(DepartmentBuilder db) {
        this.deptId = db.deptId;
        this.deptName = db.deptName;
        this.deptHead = db.deptHead;
    }

    @Override
    public String toString() {
        return "DepartmentBuild{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", deptHead='" + deptHead + '\'' +
                '}';
    }

    public static class DepartmentBuilder {

        private int deptId;

        private String deptName;

        private String deptHead;

        public DepartmentBuilder withDeptId(int deptId) {
            this.deptId = deptId;
            return this;
        }

        public DepartmentBuilder withDeptName(String name) {
            this.deptName = name;
            return this;
        }

        public DepartmentBuilder withDeptHead(String head) {
            this.deptHead = head;
            return this;
        }

        public DepartmentBuild build() {
            DepartmentBuild db = new DepartmentBuild(this);
            return db;
        }

    }

}
