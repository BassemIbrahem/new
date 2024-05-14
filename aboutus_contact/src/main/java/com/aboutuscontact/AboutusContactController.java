package com.aboutuscontact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/aboutuscontact")
public class AboutusContactController {
	

	@Autowired
	AboutuscontactService aboutuscontactService;

	public AboutusContactController(AboutuscontactService aboutuscontactService) {
		this.aboutuscontactService = aboutuscontactService;
	}
	
	@GetMapping
	public List<Information> getAllInformation() {
		return aboutuscontactService.getAllInformation();
		
	}
	

}
