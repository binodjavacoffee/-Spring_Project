package com.binodsh.um1.service;

import java.util.List;

import com.binodsh.um1.model.User;

public interface UserService {

	void saveUser(User user);

	List<User> getAllUser();

	void deleteUser(int id);

	User getUserById(int id);

	void updateUser(User user);

}
