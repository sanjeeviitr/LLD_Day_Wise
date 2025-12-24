package org.example.inheritance;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius){
        this.radius= radius;
    }

    @Override
    double area() {
        return 3.14*radius*radius;
    }

    @Override
    double perimeter() {
        return 2*3.14*radius;
    }
}
