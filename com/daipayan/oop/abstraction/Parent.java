package com.daipayan.oop.abstraction;

// public final abstract class Parent // not possible as final doesnot allow inheritance
public abstract class Parent {
    //static int salary; // will work
    int salary;
    final int VALUE;
    public Parent(int salary){
        this.salary = salary;
        VALUE = 23445;
        // VALUE = 4; second time not possible
    }
    //VALUE = 23445; not possible here
    // abstract parent(); not allowed
    // abstract static methods not possible as static methoods cant be overriden
    abstract void career(String name);
    abstract void partner(String name, int age);

    // it will work as there is no objects for abstract class needed to run this
    static void hello(){
        System.out.println("hi");
    }

    void normal(){
        System.out.println("normal");
    }

    
}
