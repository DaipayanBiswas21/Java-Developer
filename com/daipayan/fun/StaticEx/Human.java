package com.daipayan.fun.StaticEx;

public class Human {
    int age;
    String name;
    int salary;
    boolean isMarried;
    static long population;
    static void mess(){
        System.out.println("Hello abc World!");
        // System.out.println(this.age); // gives error
        // cant use this in static method
    }
    public Human(int age, String name, int salary, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.isMarried = isMarried;
        //this.population += 1;
        Human.population += 1;
        // both have same effect
        // this.mess(); gives error
        Human.mess();

    }
    
}

