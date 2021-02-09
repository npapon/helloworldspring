package fr.papounworld.helloworld;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Helloworld2Application {

	public static void main(String[] args) {
		SpringApplication.run(Helloworld2Application.class, args);
		System.out.println ("hello ");
		
	    final Logger LOGGER = LogManager.getLogger( Helloworld2Application.class.getName() );
	    
        LOGGER.log( Level.INFO, "info" );			
        LOGGER.log( Level.ERROR, "erreur" );		
        
        try {
            int result = 3 / 0;
        } catch ( Exception exception ) {
            LOGGER.log( Level.ERROR, exception );
            LOGGER.log( Level.INFO, "hello" );
        }



	    
	}

}
