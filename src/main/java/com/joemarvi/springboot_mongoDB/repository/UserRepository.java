package com.joemarvi.springboot_mongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.joemarvi.springboot_mongoDB.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
}
