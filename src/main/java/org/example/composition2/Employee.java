package org.example.composition2;


public class Employee {
    private String employeeId;
    private String employeeName;
    public Employee(String id, String name){
        this.employeeId = id;
        this.employeeName = name;
    }

    public String getEmployeeId(){
        return employeeId;
    }

    public String getEmployeeName(){
        return employeeName;
    }
}

