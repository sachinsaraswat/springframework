package com.example.simplewebapp.service;

import org.springframework.stereotype.Service;

@Service
public class QuotesService {

    public String getRandomQuote() {
        return "Good morning , it is a wonderful day!!";
    }

    
}