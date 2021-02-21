package com.promineotech.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.fishingApi.entity.User;

public interface LocationRepository extends CrudRepository<User, Long>{

}
