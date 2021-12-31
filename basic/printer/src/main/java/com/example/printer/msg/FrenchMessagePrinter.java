package com.example.printer.msg;

import org.springframework.stereotype.Component;

@Component("FrenchPrinter")
public class FrenchMessagePrinter  implements MessagePrinterInterface{

    @Override
    public void printMessage(String inpuString) {
        // TODO Auto-generated method stub

        System.out.println("<In French>" + inpuString);
        
    }
    
}
