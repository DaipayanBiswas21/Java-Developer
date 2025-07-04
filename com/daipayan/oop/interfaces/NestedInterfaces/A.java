package com.daipayan.oop.interfaces.NestedInterfaces;

public class A {
     // nested interface
    public interface NestedInterface{
        boolean isOdd(int num);
    } 
    // nested interface is static and can be public, private and protected
     // but top level interface has to be declared as public or default (means no modifier) ✅ one
    
} 
class B implements A.NestedInterface{

    @Override
    public boolean isOdd(int num) {
         return (num & 1) == 1;
    }

}zz