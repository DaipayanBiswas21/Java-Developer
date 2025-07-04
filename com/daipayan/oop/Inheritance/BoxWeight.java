package com.daipayan.oop.Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight = -1;
        this.h = -2;
    }
   // @override // we cant override
//     static void greeting(){
//     System.out.println("Hey i am in boxWeight");
// }
    public BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }
    public BoxWeight(double l, double h, double w, double weight){
        super(l, h, w); // calling the parent class constructor
        // used to initialise values present in parent class
        // works even if l is private in Box class
        this.weight = weight;
    //     System.out.println(this.w);
    //     System.out.println(super.w);
    //     System.out.println(super.weight); here it is Box.Weight
    // here super(l, h, w); will not work after this.weight = weight;
     }
    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
}
