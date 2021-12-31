package com.example.printer.msg;

import org.springframework.stereotype.Component;

@Component("EnglishPrinter")
public class EnglishMessagePrinter implements MessagePrinterInterface {

    @Override
    public void printMessage(String inpuString) {
 
        System.out.println("< In English>" + inpuString);

    }
    
}
