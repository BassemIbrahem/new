package com.aboutuscontact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutuscontactService {
	

		

	@Autowired
	AboutuscontactRepository aboutuscontactRepository;

	// constructor
	public AboutuscontactService(AboutuscontactRepository AboutuscontactRepository) {
		this.aboutuscontactRepository = AboutuscontactRepository;
	}
	public List<Information> getAllInformation() {
		return aboutuscontactRepository.findAll();
		

	}

}