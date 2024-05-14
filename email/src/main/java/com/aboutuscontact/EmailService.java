package com.aboutuscontact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	EmailRepository emailRepository;

	public void addMessage(Email email) {
		emailRepository.save(email);
		

	}

}
