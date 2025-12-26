package org.example.thisVsSuper;

public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public void showDetails(){
        System.out.println("Showing details in parent class");
    }
}
