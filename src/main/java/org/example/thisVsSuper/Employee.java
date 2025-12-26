package org.example.thisVsSuper;

public class Employee extends Person{
    public String passion;

    public Employee(String name, String passion){
        super(name);
        this.passion = passion;
    }

    public void showDetails(){
        super.showDetails();
        System.out.println("Showing details in child ");
    }
}
