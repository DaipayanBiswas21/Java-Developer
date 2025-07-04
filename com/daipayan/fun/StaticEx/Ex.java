package com.daipayan.fun.StaticEx;

public class Ex {
    public static void main(String[] args) {
        greet();
        fun1();
          // an object is created for the class Ex (done for fun3)
        // therefore we don't need to create an object for greet() as the object will be created when we call fun3
        Ex obj = new Ex();
        obj.fun3();
    }
    // it will give error as static  data can't access non-static data 
    // we know that something which is not static is object specific
    // so we can't access non-static data from static context
    //  void greet1() {
    //     System.out.println("Hello, World!");
    // }
    static void greet() {
        System.out.println("Hello, World!");
    }
    void greet1() {
        System.out.println("Hello, World!");
        fun(); // it will work as it is calling static method from non-static method
    }
    static void fun(){
        // greet1(); we cant use this because it requires an instance of the class
        // but the function we are using it in does not depend on instance of the class
        // it will give error as static method can't access non-static method
        // we know that something which is not static is object specific
        // so we can't access non-static method from static context
        //this is not dependent on object
        System.out.println("Hello, World!");
    }
    static void fun1(){
        // we are referencing it
        Ex obj = new Ex();
        obj.greet1(); // we cannot access non-static stuff without referencing their instance in a static context
        
    }
    void fun3(){
        greet(); 
    }
}


