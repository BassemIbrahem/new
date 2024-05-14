package com.aboutuscontact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/email")
public class EmailController {
	
	@Autowired
	EmailService emailService;

	@PostMapping
	public void addMessage(@RequestBody Email email) {
		emailService.addMessage(email);
		
	}
	

}
