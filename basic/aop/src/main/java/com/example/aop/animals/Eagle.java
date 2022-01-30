package com.example.aop.animals;

import org.springframework.stereotype.Component;

@Component
public class Eagle extends Bird {

    @Override
    public void move(int distance) {
        System.out.println("Flying " + distance + " miles..");
        
    }

}