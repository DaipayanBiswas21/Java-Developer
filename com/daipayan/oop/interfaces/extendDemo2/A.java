package com.daipayan.oop.interfaces.extendDemo2;

public interface A {
   // static methods cannot be overriden
   // therefore static interface methods should always have a body 
   static void greeting(){
      System.out.println("static method");
   }

   default void fun(){
      System.out.println("A");
   }
   
}
