package org.example.compositionandaggregation;

import java.util.*;
public class Company {

    private final Map<String, Department> departments = new HashMap<>();
    private final Map<String, Employee> employees = new HashMap<>();
    private final Map<String, Set<String>> departmentEmployees = new HashMap<>();

    public void addDepartment(String id, String name) {
        departments.put(id, new Department(id, name));
        departmentEmployees.put(id, new HashSet<>());
    }

    public void removeDepartment(String depId) {
        departments.remove(depId);
        departmentEmployees.remove(depId);
    }

    public void addEmployee(Employee e) {
        employees.put(e.getId(), e);
    }

    public void assignEmployeeToDepartment(String empId, String depId) {
        if (!employees.containsKey(empId) || !departmentEmployees.containsKey(depId)) return;
        departmentEmployees.get(depId).add(empId);
    }

    public void removeEmployeeFromDepartment(String empId, String depId) {
        if (departmentEmployees.containsKey(depId)) {
            departmentEmployees.get(depId).remove(empId);
        }
    }

    public void removeEmployeeFromCompany(String empId) {
        employees.remove(empId);

        for (Set<String> members : departmentEmployees.values()) {
            members.remove(empId);
        }
    }

    public void showEmployees(String depId) {
        if (!departmentEmployees.containsKey(depId)) return;

        for (String empId : departmentEmployees.get(depId)) {
            Employee e = employees.get(empId);
            System.out.println(e.getName());
        }
    }
}