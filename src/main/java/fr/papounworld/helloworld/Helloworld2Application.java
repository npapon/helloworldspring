package fr.papounworld.helloworld;


import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.papounworld.helloworld.model.HelloWorld;
import fr.papounworld.helloworld.service.BusinessService;




@SpringBootApplication
public class Helloworld2Application implements CommandLineRunner {
	
	@Autowired
	private BusinessService businessService;


	public static void main(String[] args) {
		SpringApplication.run(Helloworld2Application.class, args);
	}		

 

	@Override
	public void run(String... args) throws Exception {
HelloWorld helloWorld = businessService.getHelloWorld();
		System.out.println(helloWorld);
	
		
	}

}
