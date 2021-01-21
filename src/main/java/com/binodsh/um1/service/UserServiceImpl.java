package com.binodsh.um1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.binodsh.um1.model.User;
import com.binodsh.um1.repository.UserRepository;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUser(User user) {
		userRepository.saveUser(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.getAllUser();
	}

	@Override
	public void deleteUser(int id) {
		userRepository.deleteUser(id);
		
	}

	@Override
	public User getUserById(int id) {
		return userRepository.getUserById(id);
		
	}

	@Override
	public void updateUser(User user) {
		userRepository.updateUser(user);
		
	}

}
