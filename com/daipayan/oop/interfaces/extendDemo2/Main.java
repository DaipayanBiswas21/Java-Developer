package com.daipayan.oop.interfaces.extendDemo2;

public class Main implements A, B{
// implemenets for class to interface & interface to interface inheritance we use extends
   
    @Override //    The access modifier for overriden methods should be same or better
    // private void greet() { // error
                      
    // }
    public void greet() {
       
    }
    // @Override
    // public void fun() {
       
    // }
    // it will not give error after commenting because default is used(except b's normal fun)
    // if we use the same default fun in B then it will give error
    public static void main(String[] args) {
    //  Main obj = new Main();
        A.greeting(); // calling by the interface name
      //  Main.greeting(); obj.greeting(); not works
    }
}
