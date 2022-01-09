package com.example.simplewebapp.controller;

import com.example.simplewebapp.service.QuotesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuoteController {
    
    @Autowired
    QuotesService quotesService;

    @GetMapping("/quote")
    public String getQuote(Model model)
    {
        String quoteStr = quotesService.getRandomQuote();
        model.addAttribute("quoteMsg", quoteStr);
        System.out.println("quoteStr=" + quoteStr);

        return "quote.html";
    }
}
