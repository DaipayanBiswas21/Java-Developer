package com.daipayan.oop.abstraction;

public class Daughter extends Parent{

    public Daughter(int salary){
        // this.salary = salary;
        super(salary);

    }
    @Override
    void career(String name){
        System.out.println(name);

    }

    @Override
    void partner(String name, int age){
        System.out.println(name + " " + age);
    }
    
}