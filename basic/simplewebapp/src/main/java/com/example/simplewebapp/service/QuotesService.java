package com.example.simplewebapp.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
@Configuration
public class QuotesService {

    @Autowired
    public List<String> quoteList;


    @PostConstruct
    public  void initValue()
    {
        quoteList.forEach((k)->System.out.println(k));

    }

    public String getRandomQuote() {
        return "Good morning , it is a wonderful day!!";
    }

    
}