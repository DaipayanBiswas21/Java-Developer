package com.daipayan.oop.interfaces;

public class Car implements Engine, Brake, Media{

    int a = 30;


    @Override
    public void brake(){
        System.out.println("Brake");
    }
    @Override
    public void start(){
        System.out.println("start engine");
        // doesnot care which one is overrriding 
    }
    @Override
    public void stop(){
      System.out.println("stop engine");
    }
    @Override
    public void acc(){
       System.out.println("acc");
    }
}
