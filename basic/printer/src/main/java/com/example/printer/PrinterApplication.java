package com.example.printer;

import com.example.printer.msg.EnglishMessagePrinter;
import com.example.printer.msg.FrenchMessagePrinter;
import com.example.printer.msg.MessagePrinterInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@ConfigurationProperties
public class PrinterApplication {

	    @Value("${welcome_message}")
	    String   welcomeMessage;

	            @Autowired
				@Qualifier("FrenchPrinter")
				MessagePrinterInterface frenchMessagePrinter;
				
				@Autowired
				@Qualifier("EnglishPrinter")
				MessagePrinterInterface englishMessagePrinter;

	public static void main(String[] args) {
		SpringApplication.run(PrinterApplication.class, args);
	}

	@Bean
	public CommandLineRunner notifyMessage() 
	{
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub

				System.out.println("Running.....");

				frenchMessagePrinter.printMessage(welcomeMessage);
				englishMessagePrinter.printMessage(welcomeMessage);
				
				

			}
			
		};

	}

}
