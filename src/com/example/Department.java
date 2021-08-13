/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author Hasitha_08884
 */
public class Department {

    private int departmentId;
    private String departmentName;
    private String location;
    private Employee[] employees = new Employee[10];
    private int empCount;

    public Department(int departmentId, String departmentName, String location) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.location = location;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee[] getEmployees() {
        Employee[] actualEmps = new Employee[empCount];

        for (int i = 0; i < empCount; i++) {
            actualEmps[i] = employees[i];
        }

        return actualEmps;
    }

    public void setEmployees(Employee employee) {
        if (empCount <= 10) {
            this.employees[empCount] = employee;
            empCount++;
        }
    }

    public Employee getEmployeeById(int idNumber) {
        for (Employee emp : getEmployees()) {
            if (emp.getIdNumber() == idNumber) {
                return emp;
            }
        }
        return null;
    }

    public int getEmpCount() {
        return empCount;
    }

    public double getSalaryOfAllEmployees() {
        double allEmpSalary = 0;

        for (Employee emp : getEmployees()) {
            allEmpSalary += emp.getSalary();
        }

        return allEmpSalary;
    }

    public double getAvgSalary() {
        if (empCount > 0) {
            return getSalaryOfAllEmployees() / empCount;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Department{" + "departmentId=" + departmentId + ", departmentName=" + departmentName + ", location=" + location + '}';
    }

}
