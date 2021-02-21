package com.promineotech.fishingApi.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

 


@Entity
public class WaterBody {
	
	private Long id;
	private String name;
	private String fishery_type;
	private String species;
	private Set<User> users;     //changed from users
 	private Set<Results> results;
	
	private Location location;
	 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getwater_id() {
		return id;
	}
	
	public void setWater_id(Long id) {
		this.id = id;
	}
	
     
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFishery_type() {
		return fishery_type;
	}

	public void setFishery_type(String fishery_type) {
		this.fishery_type = fishery_type;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
//	@ManyToMany(cascade = {CascadeType.ALL})                //Many to Many with the User Table
//	@JoinTable(name = "fishing_hole",
//	joinColumns = @JoinColumn(name = "userId", referencedColumnName = "id"), 
//	inverseJoinColumns = @JoinColumn(name = "waterBodyId", referencedColumnName = "id"))
//	public Set<User> getUsers() {         //??getUsers  return users 
//		return users;
//	}
//	
//	
//	public void setUser(Set<User> users) {
//		this.users  = users;
//	}

 
//	@OneToMany(mappedBy = "results")                //One to Many with the Results Table
//	public Set<Results> getResults() {
//		return results;
//	}
//
//	public void setResults(Set<Results> results) {
//		this.results = results;
//	}

	@OneToOne(cascade = CascadeType.ALL)          //One to One with the Location Table
	@JoinColumn(name = "location_id")
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}
