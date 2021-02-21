package com.promineotech.fishingApi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
 

@Entity
public class Location {
	
	private Long location_id;
	private Long water_id;
	private String state;
	private String city;
	private String road;
	
	private WaterBody waterbody;

	 

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getLocation_id() {
		return location_id;
	}

	public void setLocation_id(Long location_id) {
		this.location_id = location_id;
	}

	public Long getWater_id() {
		return water_id;
	}

	public void setWater_id(Long water_id) {
		this.water_id = water_id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	@OneToOne(mappedBy = "location")     //One to One with WaterBody table
	public WaterBody getWaterbody() {
		return waterbody;
	}

	public void setWaterbody(WaterBody waterbody) {
		this.waterbody = waterbody;
	}
	
 
}
