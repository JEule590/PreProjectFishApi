package com.promineotech.fishingApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.fishingApi.entity.User;
import com.promineotech.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public User getUserById(Long id) throws Exception {
		try {
			return repo.findOne(id);
		} catch (Exception e) {
			throw e;
		}
	}
	
	public Iterable<User> getUsers() {
		return repo.findAll();
	}
	
	public User createUser(User user) {
		return repo.save(user);
	}
 
	public User updateUser(User user, Long id) throws Exception {
		try {
			User oldUser = repo.findOne(id);
			oldUser.setFirst_name(user.getFirst_name());
			oldUser.setLast_name(user.getLast_name());
			oldUser.setCity(user.getCity());
			oldUser.setState(user.getState());
			return repo.save(oldUser);
		} catch (Exception e) {
			throw new Exception();
		}
	}
	
	public void deleteCustomer(Long id) throws Exception {
		try {
			repo.delete(id);
		} catch (Exception e) {
			throw new Exception();
		}
	}
	
} 
