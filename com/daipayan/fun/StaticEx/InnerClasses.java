package com.daipayan.fun.StaticEx;
// outside class can never be static because it is dependent on the object of the class and not on other classes

//    class Test{
//     String name;

//     public Test(String name) { 
//         this.name = name;
//     }
// }
// here it will not give error
//  class Test{
//     static String name;

//     public Test(String name) {
//         Test.name = name;
//     }
// }
// it works and prints DB1

public class InnerClasses {
//    class Test{
//     String name;

//     public Test(String name) {
//         this.name = name;
//     }
// }
// it will give error as non-static inner class cannot be referenced from a static context
// so we need to make it static
static class Test{
    String name;

    public Test(String name) {
        this.name = name;
    }
    // it doesnot depend on object of the class InnerClasses
// internally main and test can dependent on each other
@Override
    public String toString() {
        return name;
}
}



public static void main(String[] args) {
    Test a = new Test("DB");
    Test b = new Test("DB1");
    System.out.println(a.name);
    System.out.println(b.name);
    System.out.println(a);
   }
}
 
