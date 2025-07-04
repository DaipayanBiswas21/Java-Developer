package main;

import java.util.ArrayList;

import com.daipayan.oop.encapsulation.Access;

// same subclass different package(protected)
public class SubClass extends Access{
    public SubClass(int num,String name){
        super(num, name);
    }
    public static void main(String[] args) {
        SubClass obj = new SubClass(0, null);
        // Access obj = new Access(0, null);
        // not work obj.num as it is private
        // this will work same as public class SubClass
        // Access doesnot know what the SubClass is
        int n = obj.num;
        
        
    }
}
class SubSubClass extends SubClass{
    public SubSubClass(int num, String name){
        super(num, name);
    }
    
    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass(0, null);
        int n = obj.num;
    }
}
// In Java, a .java file can have multiple classes, but only one class can be public, and that class must match the filename.
 class SubClass2 extends Access{
    public SubClass2(int num,String name){
        super(num, name);
    }
    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(0, null);
        int n = obj.num;
    }
}
