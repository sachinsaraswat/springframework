package com.example.simplewebapp.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Random;

@Service
@Configuration
@ConfigurationProperties
public class QuotesService {

     @Value("${quoteList}")
     public List<String> quoteList;


    public List<String> getQuoteList() {
        return quoteList;
    }

    public void setQuoteList(List<String> quoteList) {
        this.quoteList = quoteList;
    }

    @PostConstruct
    public  void initValue()
    {
        quoteList.forEach((k)->System.out.println(k));

    }

    public String getRandomQuote() {
       // quoteList.forEach((k)->System.out.println(k));

        System.out.println("Quote Length::" + quoteList.size());
        Random random = new Random();

        int indx = random.nextInt(quoteList.size() -1) ;

        return quoteList.get(indx).toString();
    }

    
}