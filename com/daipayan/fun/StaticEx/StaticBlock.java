package com.daipayan.fun.StaticEx;

// this a demo to show initialization of static variable
public class StaticBlock {
    static int a = 4;
    static int b;

    static {
        System.out.println("Static block initialized");
        // it will only run once, when the first obj is create i.e class is loaded for the first time
        b = a * 5;
    }
    void greet(){
        System.out.println("Hello, World!");
    }
    public static void main(String[] args) {
      // StaticBlock obj = new StaticBlock();
      // it doesnot matter if we create an object or not as variable is static
        System.out.println("Value of a: " + StaticBlock.a);
        // we can write only b rather than StaticBlock.b as it is in the same class
        System.out.println("Value of b: " + StaticBlock.b);
        StaticBlock.b += 3;
        System.out.println("Value of a: " + StaticBlock.a); 
        System.out.println("Value of b: " + StaticBlock.b);
     //StaticBlock obj2 = new StaticBlock();
        System.out.println("Value of a: " + StaticBlock.a); 
        System.out.println("Value of b: " + StaticBlock.b);
        StaticBlock obj = new StaticBlock();
        obj.greet();
    }
}
