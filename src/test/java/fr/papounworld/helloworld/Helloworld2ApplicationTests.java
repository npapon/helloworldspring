package fr.papounworld.helloworld;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.papounworld.helloworld.service.BusinessService;

@SpringBootTest
class Helloworld2ApplicationTests {
	
	@Autowired
	private  BusinessService businessService;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void Given2Nombres_WhenAddition_ThenResulat(){
		
		assertThat(2 + 3).isEqualTo(5);
;		
	}
	
	@Test
public void EtantDonneUneInstanceDeBusinessServiceOnAppelleLaMethodeGetHelloWorldAlorsLAttributValueDeHelloWorldVautHelloWorld() {
		
	assertThat("Hello World !!!").isEqualTo(businessService.getHelloWorld().getValue());

	}

	
}
