package com.daipayan.oop.encapsulation;
// same class(protected)
public class Access {
    // data members
    protected int num; // gives security // data hiding
    // now num can be accessed from anywhere in this file
    
    // public String name can be accesed from anywhere
    String name;
    int[] arr;


    // public can be accessed from anywhere
    // getters
    public int getNum(){ // this for private num mainly
        return num;
    }

    //setters
    public void setNum(int num){ // this for private num mainly
        this.num = num;
    }

    public Access(int num, String name){
        this.num = num;
        this.name = name;
        this.arr =  new int[34];
    }
}
