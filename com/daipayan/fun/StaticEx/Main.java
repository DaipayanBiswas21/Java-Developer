package com.daipayan.fun.StaticEx;

public class Main {
    public static void main(String[] args) {
          Human h1 = new Human(25, "Daipayan", 100000, false);
          Human h2 = new Human(30, "Sourav", 200000, true);
          Human h3 = new Human(35, "Gourav", 200, false);
          System.out.println("Name: " + h1.name + " Age: " + h1.age + " Salary: " + h1.salary + " Is Married: " + h1.isMarried);
          System.out.println("Name: " + h2.name + " Age: " + h2.age + " Salary: " + h2.salary + " Is Married: " + h2.isMarried);
        // System.out.println("Population: " + h1.population);
        // System.out.println("Population: " + h2.population);
        // System.out.println("Population: " + h3.population);
        // it will work but convention is to use class name
        System.out.println("Population: " +  Human.population);
        System.out.println("Population: " +  Human.population);
        System.out.println("Population: " +  Human.population);
    }
}
