package com.goal.facingapi.repo;

import java.util.List;

import com.goal.facingapi.model.UserData;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDataRepo extends MongoRepository<UserData, String> {
    
    
    List<UserData> findAll();
    

}