package com.daipayan.oop.interfaces;

public class NiceCar {
    // its not static tthat means it depends on object 

    private Engine engine;
    private Media player = new CDPlayer();

    public NiceCar(){
        engine = new PowerEngine();
    }
    public NiceCar(Engine engine){
        this.engine = engine; // thats why it is
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }
    public void upgradeEngine(){
       engine = new ElectricEngine();
    }
}
