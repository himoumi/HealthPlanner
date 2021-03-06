package com.ibm.healthplanner.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.healthplanner.spring.bean.User;
import com.ibm.healthplanner.spring.repository.UserRepository;

@Service
@Transactional
public class UserServiceImp implements UserService {
	@Autowired
	UserRepository userRepository;

	public void createUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	public List<User> getUser() {
		// TODO Auto-generated method stub
		return (List<User>) userRepository.findAll();
	}

	/*
	 * public Optional<User> findById(String id) { // TODO Auto-generated method
	 * stub return userRepository.findById(id);
	 * 
	 * }
	 */

	public User update(User user, String l) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	/*
	 * public void deleteUserById(String id) { // TODO Auto-generated method stub
	 * userRepository.delete(id); }
	 */
	/*
	 * public User updatePartially(User user, String id) { // TODO Auto-generated
	 * method stub User usr = findById(id); usr.setCountry(user.getCountry());
	 * return userRepository.save(usr); }
	 */



}
