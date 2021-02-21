package com.promineotech.fishingApi.service;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.fishingApi.entity.Location;
import com.promineotech.fishingApi.entity.WaterBody;
import com.promineotech.repository.LocationRepository;
import com.promineotech.repository.UserRepository;
//import com.promineotech.repository.WaterBodyRepository;

/*@Service
public class LocationService {
	
	@Autowired
	private LocationRepository repo;
	
	@Autowired
	private WaterBodyRepository waterBodyRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	
	public Iterable<Location> getLocations() {
		 return repo.findAll(location);
	}
 	
	public Location getLocationById(Long location_id) throws Exception {
		try {
			 return repo.findOne(location_id);
		} catch (Exception e) {
			throw e;
	    }
	 }		
	
	public Location createLocation (Location location)  {
			return repo.save(location);
		}
				
	 
	
	public void deleteLocation(Long location_id) throws Exception {
		try {
			repo.delete(location_id);
		} catch (Exception e) {
			throw new Exception();
		}
	}
 
}*/
