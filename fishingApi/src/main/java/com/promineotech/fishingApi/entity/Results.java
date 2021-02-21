package com.promineotech.fishingApi.entity;

import java.util.Set;

import com.promineotech.fishingApi.entity.WaterBody;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Results {
	
	private Long result_id;
	private Long number;
	private Long largest;
	private String method_used;
	private Set<Notes> notes;
	
	@JsonIgnore              //Do I need a user_id?
	private User user;            
	
	@JsonIgnore                          // Do I need a waterBody_id?
	private WaterBody waterBody;
	
	 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getResult_id() {
		return result_id;
	}
	
	public void setResult_id(Long result_id) {
		this.result_id = result_id;
	}

	@ManyToOne           //Many to one with the WaterBody Table
	@JoinColumn(name = "user_id") 
	public User getUser_id() {       //Jeff to look at again
		return user;
	}

	public void setUser_id(User user) {
		this.user = user;
	}
	
//	//@ManyToOne			//Many to One with the WaterBody Table
//	//@JoinColumn(name = "waterBody_id") 
//	public WaterBody getWaterBody_id() {       //Jeff to look at again
//		return waterBody;
//	}
//
//	public void setWaterBody(WaterBody waterBody) {
//		this.waterBody = waterBody;
//	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public Long getLargest() {
		return largest;
	}

	public void setLargest(Long largest) {
		this.largest = largest;
	}

	public String getMethod_used() {
		return method_used;
	}

	public void setMethod_used(String method_used) {
		this.method_used = method_used;
	}

	 @OneToMany(mappedBy = "results_id")          //One to Many with the NOtes Table
	public Set<Notes> getNotes() {
		return notes;
	}

	public void setNotes(Set<Notes> notes) {
		this.notes = notes;
	}

	/*public Long getWater_id() {                   // Is this necessary?
		return water_id;
	}

	public void setWater_id(Long water_id) {
		this.water_id = water_id;
	}*/
		

}
