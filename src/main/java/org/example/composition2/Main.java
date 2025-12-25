package org.example.composition2;

public class Main {

    public static void main(String[] args) {
        Company c1 = new Company();
        Employee e1 = new Employee("1", "Ram");
        Employee e2 = new Employee("2", "Shyam");
        Employee e3 = new Employee("3", "Rahul");

        c1.addDepartment("D1", "testing");
        c1.addDepartment("D2", "dev");

        c1.addEmployee(e1, "D1");
        c1.addEmployee(e2, "D1");
        c1.addEmployee(e3, "D2");
        c1.showEmployees("D1");
        c1.removeEmployee("1", "D1");
        c1.showEmployees("D1");
    }


}
