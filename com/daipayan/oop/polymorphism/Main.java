package com.daipayan.oop.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Shapes square1 = new Square();
        Shapes circle1 = new Circle();
        shape.area();
        circle.area();
        square .area();
        triangle.area();
        square1 .area();
        circle1.area();

    }
}
