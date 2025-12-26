package org.example.association2;

public class Main {

    public static void main(String[] args) {
        School s1 = new School("STPS");
        Student su1 = new Student("Divya");
        Student su2 = new Student("Sanjeev");
        s1.addStudent(su1);
        s1.addStudent(su2);
        s1.showStudents();
        s1.removeStudent(su2);
        s1.showStudents();
    }
}
