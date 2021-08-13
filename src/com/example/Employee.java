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
public class Employee {

    private int idNumber;
    private String name;
    private double salary;

    public Employee(int idNumber, String name, double salary) {
        this.idNumber = idNumber;
        this.name = name;
        this.salary = salary;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "idNumber=" + idNumber + ", name=" + name + ", salary=" + salary + '}';
    }
}
