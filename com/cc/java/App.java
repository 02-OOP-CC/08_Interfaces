package com.cc.java;

import com.cc.java.bees.*;
import com.cc.java.birds.Bird;

public class App {
    
    public static void main(String[] args) {
     
        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();
        pollObj(queen);
        pollObj(worker);
        pollObj(drone);

        Bird bird = new Bird();
        pollObj(bird);

    }

    // 2. Variante Polymorphie + Overloading
    private static void pollObj(HoneyBee bee) {
        output(bee.fly());
        output(bee.doYourJob());
        
    }

    private static void pollObj(Bird bird) {
        output(bird.fly());
        output(bird.hasFeathers());
    }


   
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

