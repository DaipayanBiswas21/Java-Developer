package com.daipayan.oop.abstraction;


//final public class Son extends Parent
// it cant be final as it will prevent inheritance 
public class Son extends Parent{

    public Son(int salary){
        // this.salary = salary;
        super(salary);
        

    }
    @Override
    void normal(){
        super.normal();
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
