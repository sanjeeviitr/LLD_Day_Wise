package org.example.composition2;


import java.util.ArrayList;
import java.util.List;

class Department {
    private String departmentId;
    private String departmentName;
    private List<Employee> employees;
    public Department(String id, String name){
        this.departmentId = id;
        this.departmentName = name;
        this.employees = new ArrayList<>();
    }

    public String getDepartmentId(){
        return departmentId;
    }

    public String getDepartmentName(){
        return departmentName;
    }

    public void addEmployee(Employee a){
        employees.add(a);
        System.out.println("added employee " + a.getEmployeeName());
    }

    public void removeEmployee(String empId){
        employees.removeIf(employee -> employee.getEmployeeId().equals(empId));
        System.out.println("removed employee " + empId);
    }

    public void showEmployees(){
        for(Employee employee: employees){
            System.out.println("Employee present is: " + employee.getEmployeeName());
        }
    }


}
