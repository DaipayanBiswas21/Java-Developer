package com.daipayan.oop.encapsulation;
// same subclass same package(protected)
public class SubClass extends Access{
    public SubClass(int num,String name){
        super(num, name);
    }
    public static void main(String[] args) {
        SubClass obj = new SubClass(0, null);
        int n = obj.num;
        // obj instanceof Access, where instanceof is an an operator 
        System.out.println(obj instanceof Access);
        System.out.println(obj instanceof SubClass);
        System.out.println(obj instanceof Object);
       
    }
}
