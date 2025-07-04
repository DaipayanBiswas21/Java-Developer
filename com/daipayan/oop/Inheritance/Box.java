package com.daipayan.oop.Inheritance;

// public final class Box will prevent the class from being inherited
// it implicitly declares all of its methods final too
// A final method in Java supports compile-time polymorphism (method overloading) but restricts runtime polymorphism (method overriding).
public class Box {
    double l;
    double w;   
    double h;
    // double weight; // data hiding
    static void greeting(){
        System.out.println("Hey i am in box");
    }
    // works even if l is private
    // since this is in this class only therefore it can access private methods or variables
    // gives l that is initialised in function
    public double getL(){ // encapsulation
        return l;
    }
    Box (){
        this.l = -1;
        this.w = -1;
        this.h = -1;

}
// cube
Box(double side){
    this.l = side;
    this.w = side;
    this.h = side;
    //super(); object class
}
//random
Box(double l, double h, double w){
    System.out.println("Box class constructor");
    this.l = l;
    this.h = h;
    this.w = w;
}
Box(Box old){
    this.h = old.h;
    this.w = old.w;
    this.l = old.l;
}
public static void info(){
    System.out.println("Running the box");
}
public void info1(){
    System.out.println("Running the box xyz");
}
}

