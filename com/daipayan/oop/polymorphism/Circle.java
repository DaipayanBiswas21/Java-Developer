package com.daipayan.oop.polymorphism;

public class Circle extends Shapes{
    @Override // this is called annotation
    // this will run when obj of Circle class is created
    // hence its overriding the parent method
    void area(){
        System.out.println("i am in Circle"); 
     }
}
