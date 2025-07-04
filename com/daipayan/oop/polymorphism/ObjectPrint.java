package com.daipayan.oop.polymorphism;

public class ObjectPrint {
    int num;
    public ObjectPrint(int num){
        this.num = num;
    }
    // at run time this will run:
    @Override
    public String toString(){
        return "ObjectPrint{num = "  + num + '}';

    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);
        System.out.println(obj);
    }
}
