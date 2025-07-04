package com.daipayan.oop;

import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        //    // whenever we want to access such methods, variables by a class name 
        // we have to make them static
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        // all 3 ref variables are pointing to the same object
   } 

}
