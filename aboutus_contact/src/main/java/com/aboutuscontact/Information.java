package com.aboutuscontact;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Information {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="completed_Trips")
	private int completedTrips;

	private int tourGuides;
	
	private int destination;
	
	
	public Information() {
	}

	public Information(int completedTrips, int tourGuides, int destination) {
		this.completedTrips = completedTrips;
		this.tourGuides = tourGuides;
		this.destination = destination;
	}
	

	
	/**
	 * @return the completedTrips
	 */
	public int getCompletedTrips() {
		return completedTrips;
	}
	
	/**
	 * @param completedTrips the completedTrips to set
	 */
	public void setCompletedTrips(int completedTrips) {
		this.completedTrips = completedTrips;
	}
	
	/**
	 * @return the tourGuides
	 */
	public int getTourGuides() {
		return tourGuides;
	}
	
	/**
	 * @param tourGuides the tourGuides to set
	 */
	public void setTourGuides(int tourGuides) {
		this.tourGuides = tourGuides;
	}
	
	/**
	 * @return the destination
	 */
	public int getDestination() {
		return destination;
	}
	
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(int destination) {
		this.destination = destination;
	}

}
