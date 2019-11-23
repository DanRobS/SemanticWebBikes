package com.semweb.bikeproject.model;

public class Station {

	//private String location;
	private String name;
	private String capacity;
	private String available_bikes;
	private String longitude;
	private String latitude;
	
	public Station() {
		// TODO Auto-generated constructor stub
	}

	public Station(String name, String capacity, String available_bikes, String longitude,
			String latitude) {
		super();
		this.name = name;
		this.capacity = capacity;
		this.available_bikes = available_bikes;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getAvailable_bikes() {
		return available_bikes;
	}

	public void setAvailable_bikes(String available_bikes) {
		this.available_bikes = available_bikes;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return "Station [name=" + name + ", capacity=" + capacity + ", available_bikes="
				+ available_bikes + ", longitude=" + longitude + ", latitude=" + latitude + "]";
	}
	
}
