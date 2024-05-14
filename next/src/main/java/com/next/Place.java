package com.next;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Place {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="recommended_places")
	private String recommeddedPlaces;
	
	private String description;
	
	@Column(name="pic")
	private int image;
	/**
	 * @return the recommeddedPlaces
	 */
	public String getRecommeddedPlaces() {
		return recommeddedPlaces;
	}
	/**
	 * @param recommeddedPlaces the recommeddedPlaces to set
	 */
	public void setRecommeddedPlaces(String recommeddedPlaces) {
		this.recommeddedPlaces = recommeddedPlaces;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
