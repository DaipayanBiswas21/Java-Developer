package main;

import com.daipayan.fun.Hello;
import com.daipayan.oop.encapsulation.Access;
public class hi {
    public static void main(String[] args) {
        System.out.println("Hi, World!");
        Hello.main(args);
        Access a = new Access(23, "xyz");
        System.out.println(a.getNum());
        a.setNum(34);
        System.out.println(a.getNum());
        

    }
}
