package com.promineotech.fishingApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.fishingApi.entity.Notes;
import com.promineotech.repository.NotesRepository;

@Service
public class NotesService {

	@Autowired
	private NotesRepository repo;
	
	public Notes getNotesById(long notes_id) {
		try {
			return repo.findOne(notes_id);
		} catch (Exception e) {
			throw e;
		}
	}
	
	public Notes createNotes(Notes notes) {
		return repo.save(notes);
	}
	 
	public void deleteNotes(Long notes_id) throws Exception {
		try {
			repo.delete(notes_id);
		}catch (Exception e) {
			throw new Exception();
		}
	}
}
