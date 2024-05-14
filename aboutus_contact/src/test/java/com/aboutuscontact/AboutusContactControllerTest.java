package com.aboutuscontact;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@ExtendWith(SpringExtension.class)
@WebMvcTest(AboutusContactControllerTest.class)
public class AboutusContactControllerTest{
	
	//@MockBean
	//AboutuscontactService aboutuscontactService ;

	@Autowired
	private MockMvc mvc;	
	
	
	
	@Test
	public void getAllInformationTest() throws Exception{	

		//mock objects to interact with them 
		AboutuscontactService  aboutuscontactServiceMock = mock(AboutuscontactService.class);
		
		// create customer CustomerRegisterarionRequest object 
		Information information1 =  new Information(78,8,98);
		Information information2 =  new Information(78,8,98);
		Information information3 =  new Information(78,8,98);
		List<Information> allInformation = new ArrayList<>();
		allInformation.add(information1);
		allInformation.add(information2);
		allInformation.add(information3);
				
		//the action of handling the interaction 
		when(aboutuscontactServiceMock.getAllInformation()).thenReturn(allInformation);

		RequestBuilder request = MockMvcRequestBuilders.get("/api/v1/aboutuscontact");
		mvc.perform(request);
		
	}
}
