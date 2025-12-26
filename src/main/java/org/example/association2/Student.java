package org.example.association2;

public class Student {

    private String name;
    private School school;

    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSchool(School a){
        this.school = a;
    }

    public void unsetSchool(){
        this.school = null;
    }




}
