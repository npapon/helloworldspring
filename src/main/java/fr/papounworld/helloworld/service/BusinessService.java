package fr.papounworld.helloworld.service;

import org.springframework.stereotype.Component;

import fr.papounworld.helloworld.model.HelloWorld;

@Component 
public class BusinessService {
	
	public HelloWorld getHelloWorld() {
		
		HelloWorld hw = new HelloWorld();
		return hw;
	}

}
