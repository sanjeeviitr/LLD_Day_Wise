package org.example.inheritance;

public class Rectangle extends Shape{
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.width = width;
        this.length = length;
    }

    @Override
    double area() {
        return length*width;
    }

    @Override
    double perimeter() {
        return 2*(length+width);
    }
}
