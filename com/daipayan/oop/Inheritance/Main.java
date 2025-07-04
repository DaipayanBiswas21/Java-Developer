package com.daipayan.oop.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(5.6, 5.8, 457.9);
        Box box1 = new Box(box);
        System.out.println(box.l + " " + box.w +" " + box.h);
        System.out.println(box1.l+ " " + box1.w +" " + box1.h);
        box.info1();
        Box.info();
        BoxWeight box2 = new BoxWeight();
        System.out.println(box2.l + " " + box2.h + " " + box2.weight);
        BoxWeight box3 = new BoxWeight(2, 3, 4, 8);
        System.out.println(box3.l + " " + box3.w +" " + box3.h+ " " + box3.weight);
        Box box4 = new BoxWeight(1, 2, 3, 4);
        System.out.println(box4.h); // not box4.weight
        // there are many variables in both parent and child classes
        // you are given access to variables that are in the reference type i.e BoxWeight
        // hence you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // BoxWeight box5 = new Box(1, 2, 3); 
        //  that is why error

        BoxPrice box5 = new BoxPrice(5, 200, 500);
        Box box6 = new Box();
        box6.greeting();
        // better
        Box.greeting();
        Box box7 = new BoxWeight();
        box7.greeting();
        // static methods can be inherited but cannot be overriden
        BoxWeight box8 = new BoxWeight();
        box8.greeting();
        BoxWeight box9 = new BoxWeight();
        BoxWeight.greeting(); // you can inherit but you cannot override
        System.out.println(box.getL());
    
    
    }  
}
