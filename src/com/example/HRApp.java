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
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("HRApp is starting...");        
        Department department = new Department(1, "HR", "Head Office");
        System.out.println(department.toString());
        
        Employee e1 = new Employee(1, "John", 50000.00);
        Employee e2 = new Employee(2, "Anne", 40000.00);
        Employee e3 = new Employee(3, "Tim", 35000.00);
        
        department.setEmployees(e1);
        department.setEmployees(e2);
        department.setEmployees(e3);
        
        for(Employee emp: department.getEmployees()){
            System.out.println(emp.toString());
        }
        
        System.out.println("Search employee: "+department.getEmployeeById(3));        
        System.out.println("All employees count: "+department.getEmpCount());
        System.out.println("Total salary of department: "+department.getDepartmentName()+ " "+department.getSalaryOfAllEmployees());
        System.out.println("Avg salary of department: "+department.getDepartmentName()+ " "+department.getAvgSalary());
        
    }
    
}
