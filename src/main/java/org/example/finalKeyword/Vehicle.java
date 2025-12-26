package org.example.finalKeyword;

public class Vehicle {

    private String vehicleName;

    public Vehicle(String name){
        this.vehicleName = name;
    }

    public void start(){
        System.out.println("vehicle started");
    }

    public final void stop(){
        System.out.println("Vehicle stopped");
    }
}
