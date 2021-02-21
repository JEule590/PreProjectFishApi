package com.promineotech.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.fishingApi.entity.Notes;

public interface NotesRepository extends CrudRepository<Notes, Long> {

}
