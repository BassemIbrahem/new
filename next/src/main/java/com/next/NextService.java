package com.next;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NextService {
	
	
	@Autowired
	NextRepository nextRepository;
	public List<Place> getAllPlaces(){
		return nextRepository.findAll();
	}

}
