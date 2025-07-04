package com.daipayan.oop.encapsulation;
// same package(protected)
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Access obj = new Access(10, "Db");
    // need to do few things
    // 1. access the data members
    // 2. modify the data members
    // ArrayList<Integer> list = new ArrayList<>(23);
    // list.DEFAULT_CAPACITY; // not allowed as it is private
    
    System.out.println(obj.getNum());
    obj.setNum(50);
    System.out.println(obj.getNum());
    // protected test
    // obj.num
     
    }

}
