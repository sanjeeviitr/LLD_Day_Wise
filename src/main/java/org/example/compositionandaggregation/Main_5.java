package org.example.compositionandaggregation;

public class Main_5 {
    public static void main(String[] args) {

        Company company = new Company();

        company.addDepartment("D1", "Testing");
        company.addDepartment("D2", "Development");

        Employee e1 = new Employee("1", "Ram");
        Employee e2 = new Employee("2", "Shyam");

        company.addEmployee(e1);
        company.addEmployee(e2);

        company.assignEmployeeToDepartment("1", "D1");
        company.assignEmployeeToDepartment("2", "D1");

        company.showEmployees("D1");

        company.removeDepartment("D1");   // employees still alive

        company.removeEmployeeFromCompany("2"); // also removed from all deps
    }
}
