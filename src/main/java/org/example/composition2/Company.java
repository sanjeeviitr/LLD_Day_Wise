package org.example.composition2;
import java.util.*;

public class Company {
    private List<Department> departments;

    public Company(){
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String id, String name){
        Department d = new Department(id, name);
        departments.add(d);
    }

    public void removeDepartment(String depId){
        departments.removeIf(department -> department.getDepartmentId().equals(depId));
    }

    public void addEmployee(Employee a, String depId){
        for(Department d : departments){
            if(d.getDepartmentId().equals(depId)){
                d.addEmployee(a);
            }
        }
    }

    public void removeEmployee(String empId, String depId){
        for(Department d : departments){
            if(d.getDepartmentId().equals(depId)){
                d.removeEmployee(empId);
            }
        }
    }

    public void showEmployees(String depId){
        for(Department d : departments){
            if(d.getDepartmentId().equals(depId)){
                d.showEmployees();
            }
        }
    }
}
