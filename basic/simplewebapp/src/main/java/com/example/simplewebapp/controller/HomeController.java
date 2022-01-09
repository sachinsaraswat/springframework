package com.example.simplewebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    

    @GetMapping({"/", "/home"})
    public String home( Model model)
    {
        model.addAttribute("welcomeMessage", "Welcome To Simple Quotes Web app");

        return "index.html";
    }
}
