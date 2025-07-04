package com.daipayan.oop.abstraction;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30000);
        son.career("engineer");
        System.out.println(son.salary);

        Daughter daughter = new Daughter(45000);
        daughter.career("doctor");
        System.out.println(daughter.salary);

        // cannot create objects of an abstract class like this
        // Parent mom = new Parent(56000) {
            
        // };
        // mom.normal(); will not works as mom cant be created 

        Parent.hello();
        son.normal();

        Parent daughter1 = new Daughter(45000);
        daughter1.career("doctor");
        System.out.println(daughter1.salary);

    }
}
