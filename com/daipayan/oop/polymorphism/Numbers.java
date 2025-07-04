package com.daipayan.oop.polymorphism;

public class Numbers {
     int sum(int a, int b){
         return a + b;

     }
    // int sum(int b, int a){
    //     return a + b;

    // } THIS WILL NOT WORK 
    int sum(int a, int b, int c){
        return a + b + c;
        
    }
    int sum(String a, int b){
        return b;
// order of the type is different
    }
    int sum(int b, String a){
        return b;

    }
    // void sum(int a, int b){
    //     int c = a + b;

    // } it will not work
    // In function overloading, functions must differ in the number or type of parameters. However, both functions have the same parameter types: (int, int). The compiler cannot distinguish between them based on return type alone, leading to an error.
    int sum(double b, int a){
        return a;

    }
    Numbers(){
        System.out.println("Hi xyz");
    }
    Numbers(String x){
        System.out.println("hi " + x);

    }
    public static void main(String[] args) {
        Numbers num = new Numbers("DB");
        //creating new Numbers("DB") happens at run time
        // but type checking done at compile time
        num.sum(2, 3);
        num.sum(3, 5); // if we comment 
        // int sum(int a, int b){
        //     return a + b;
   
        // } then it will call the double one by default
        num.sum(4, 5,7);
       // num.sum(1, 2, 3, 4, 0, 0); error
    }

}

