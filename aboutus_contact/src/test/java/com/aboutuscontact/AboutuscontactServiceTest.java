package com.aboutuscontact;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AboutuscontactServiceTest {


	@Test
	public void AboutuscontactTest() {

		
		// mock objects to interact with them 
		
		AboutuscontactRepository AboutuscontactRepositoryMock = mock(AboutuscontactRepository.class);
		// create customer service object 
		AboutuscontactService AboutuscontactService = new AboutuscontactService(AboutuscontactRepositoryMock);
	
		// creating objects that we want to return from calling database or other services 
		Information information1 =  new Information(78,8,98);
		Information information2 =  new Information(78,8,98);
		Information information3 =  new Information(78,8,98);
		List<Information> allInformation = new ArrayList<>();
		allInformation.add(information1);
		allInformation.add(information2);
		allInformation.add(information3);


		//the action of handling the interaction 
		when(AboutuscontactRepositoryMock.findAll()).thenReturn(allInformation);

		// invoking the actual method
		AboutuscontactService.getAllInformation();

		// make sure is objects are injected
		verify(AboutuscontactRepositoryMock, times(1)).findAll();			
	}

}
