package org.example.day3;

public class Car {
    String model;
    private Engine engine;
    public Car(String model, Engine engine){
        this.engine = engine;
        this.model = model;
    }

    public void startCar(){
        engine.start(model);
    }

    public void stopCar(){
        engine.stop(model);
    }

    public void drive(){
        System.out.println(model + " is being driven by user");
    }
}
