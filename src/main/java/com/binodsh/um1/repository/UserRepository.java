package com.binodsh.um1.repository;

import java.util.List;

import com.binodsh.um1.model.User;

//package name can be dao or repository but best is repository
public interface UserRepository {
	void saveUser(User user);
	
	List<User>getAllUser();

	void deleteUser(int id);
	
	User getUserById(int id);
	
	void updateUser(User user);
}
