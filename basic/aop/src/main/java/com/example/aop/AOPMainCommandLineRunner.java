package com.example.aop;

import com.example.aop.animals.Bird;
import com.example.aop.animals.Mammal;
import com.example.aop.vehicles.Vehicle;

import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;



@Component
public class AOPMainCommandLineRunner  implements CommandLineRunner{


    @Autowired
    Mammal animal; 

    @Autowired
    Vehicle vehicle;

    @Autowired
    Bird bird;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Running ...............");
        animal.move(100);

        vehicle.move(100);

        bird.move(100);
    }

    
    
}
