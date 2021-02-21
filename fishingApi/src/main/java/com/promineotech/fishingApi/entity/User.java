package com.promineotech.fishingApi.entity;

 
import java.util.Set;

 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
 

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {
	
	private Long id;
	private String first_name;
	private String last_name;
	private String city;
	private String state;
	
	@JsonIgnore
	private Set<WaterBody> waterBodys;
	
	//@JsonIgnore
	//private Set<Results> results;
		

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getUserId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

//	@ManyToMany(mappedBy = "user")
//	public Set<WaterBody> getWaterBodys() {
//		 
//		return waterBodys;
//	}
//
//	public void setWaterBody(Set<WaterBody> waterBodys) {
//		this.waterBodys = waterBodys;
//	}
	
/*	@ManyToMany(mappedBy = ("user"))
	public Set<Results> getResults() {
		 
		return results;
	}

	public void setResults(Set<Results> results) {
		this.results = results;
	}*/


}
