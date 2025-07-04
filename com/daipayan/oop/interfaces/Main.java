package com.daipayan.oop.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
       // Engine car = new Car(); // able to do it
      // but the car.brake(); will not work as it is not present in Engine 
      // car.a will not work due to the same reason
        car.acc();
        car.brake();
        car.start();
        car.stop();
        Media carMedia = new Car();
        carMedia.stop(); // not working as our wish

        NiceCar car1 = new NiceCar();
        car1.start();
        car1.startMusic();
        car1.upgradeEngine();
        car1.start();
        car1.startMusic();
    }
}
