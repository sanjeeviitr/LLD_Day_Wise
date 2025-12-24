package org.example.inheritance;

public class Main_inh {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(15, 10);
        Shape circle = new Circle(7);

        System.out.println(rectangle.area());
        System.out.println(circle.area());
    }
}
