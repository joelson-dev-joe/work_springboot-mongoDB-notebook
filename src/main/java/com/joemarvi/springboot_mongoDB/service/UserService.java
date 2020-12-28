package com.joemarvi.springboot_mongoDB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joemarvi.springboot_mongoDB.domain.User;
import com.joemarvi.springboot_mongoDB.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll(){
		return repo.findAll();
	}

}
