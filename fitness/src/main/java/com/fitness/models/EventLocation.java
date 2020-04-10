package com.fitness.models;

import javax.persistence.Embeddable;

@Embeddable
public class EventLocation {

	private double latitude;
	private double longitude;
	
	

	public double getLatitude() {
		return latitude;
	}



	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}



	public double getLongitude() {
		return longitude;
	}



	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}



	public EventLocation() {
		
	}
}
