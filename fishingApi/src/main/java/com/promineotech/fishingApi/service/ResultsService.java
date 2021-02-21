package com.promineotech.fishingApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.fishingApi.entity.Results;
import com.promineotech.repository.ResultsRepositorty;

@Service
public class ResultsService {
	
	@Autowired
	private ResultsRepositorty repo;
	

	public Results getResultsById(long results_id) throws Exception {
		try {
			return repo.findOne(results_id);
		} catch (Exception e) {
			throw e;
		}
	}
	
	public Iterable<Results> getResults() {
		return repo.findAll();
	}
	
	public void removeResults(Long results_id) throws Exception{
		try {
			repo.delete(results_id);
		} catch (Exception e) {
			throw new Exception();
		}
	}
}
