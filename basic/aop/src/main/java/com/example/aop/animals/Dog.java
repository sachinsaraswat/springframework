package com.example.aop.animals;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Mammal {

    

    public void move(int distance)
    {

        System.out.println("Running " + distance + " meters");
    }
    
}
