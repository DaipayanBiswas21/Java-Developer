package com.daipayan.oop;

public class Singleton {
    private Singleton() {
    }
    // since this instance is not dependent on any object of the class Singleton
    // we can make it static
    private static Singleton instance;
    // Accessing the Instance Without Creating an Object of the class (getInstance())
    public static Singleton getInstance(){
        // here return type is singleton
        // check wheteher 1 object is created or not
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
     
        
    }
  //  You're using static in public static Singleton getInstance() because you need to call Singleton.getInstance() without creating an object.
//   We must call getInstance() without an object (Singleton.getInstance()), so it must be static.
// It returns the only instance of Singleton, ensuring the Singleton pattern works.
// Final Answer:
// If you want to access something using the class name, it must be static.
// We make getInstance() static because it needs to be called without an object.
// However, not all methods must be static—only the ones that belong to the class itself, not an instance.
}
// Understanding: Singleton obj = Singleton.getInstance();
// This line means:

// Singleton.getInstance() is a static method → It is being called directly using the class name (Singleton) without creating an object.
// The method returns a Singleton object → The returned instance is stored in obj.
// Does this mean we always need to make methods static if we access them via class name?
// Not necessarily. We make methods or variables static when:

// They belong to the class rather than instances.
// They need to be accessed without creating an object.



