package com.example.aop.vehicles;

import org.springframework.stereotype.Component;

@Component
public class Camry  extends Vehicle{

    @Override
    public void move(int distance) {
        System.out.println("Driving " + distance + " miles");
        
    }

}