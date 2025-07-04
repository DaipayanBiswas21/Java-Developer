package com.daipayan.oop.encapsulation;

public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    // public boolean equals(Object obj) {
    //     // TODO Auto-generated method stub
    //     return super.equals(obj);
    // }
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }
// hashmap lecture
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    } // random integer value formed via using some algorithm
    // public int hashCode() {
    //     // TODO Auto-generated method stub
    //     return num;
    // }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(5, 56.8f);
        ObjectDemo obj1 = new ObjectDemo(5, 66.3f);
        ObjectDemo obj2 = obj1;
        System.out.println(obj.num);
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        if (obj == obj1) { // check object address // same refernce
            System.out.println("they are equal");
        }
        if (obj.equals(obj1)) { // check objects value
            System.out.println("they are equal1");
        }
        System.out.println(obj1.getClass());
        System.out.println(obj1.getClass().getName());
        System.out.println(obj1.getClass().getSimpleName());
        System.out.println(obj1.getClass().isInstance(obj2));
        System.out.println(obj1.getClass().getSuperclass());
        System.out.println(obj1.getClass().getMethods());
        System.out.println(obj1.getClass().getConstructors());
         // final methods getClass() can be inherited, but cannot be overridden.

    }
    
}
