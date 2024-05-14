package com.aboutuscontact;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class AboutuscontactJpaTest {

	@Autowired
	AboutuscontactRepository aboutuscontactRepository ;

	@Test
	public void firtTest() {
		Information information= new Information (1,2,3);
		aboutuscontactRepository.saveAndFlush(information);
	}
}
