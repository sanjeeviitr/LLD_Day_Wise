package org.example.association2;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Student> students;
    private String schoolName;

    public School(String name){
        this.schoolName = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
        student.setSchool(this);
    }

    public void removeStudent(Student student){
        students.remove(student);
        student.unsetSchool();
    }

    public void showStudents(){
        for(Student student : students){
            System.out.println(student.getName());
        }
    }
}
