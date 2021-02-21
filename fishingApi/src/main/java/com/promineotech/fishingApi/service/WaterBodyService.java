package com.promineotech.fishingApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.fishingApi.entity.WaterBody;
import com.promineotech.repository.WaterBodyRepository;

@Service
public class WaterBodyService {
	
   @Autowired
   private WaterBodyRepository repo;
 
   public Iterable<WaterBody> getWaterBodys() {
	   return repo.findAll();
   }
 
   public WaterBody createWaterBody(WaterBody waterBody) {
	   return repo.save(waterBody);
   }
   
   public void removeWaterBody(Long water_id) throws Exception {
	   try {
		   repo.delete(water_id);
	   } catch (Exception e) {
		   throw new Exception();
	   }
   }
 

}
