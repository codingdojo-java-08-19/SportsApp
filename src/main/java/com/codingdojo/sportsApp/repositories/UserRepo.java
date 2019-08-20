package com.codingdojo.sportsApp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.sportsApp.models.User;

public interface UserRepo extends CrudRepository<User, Long>{

}
