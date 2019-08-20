package com.codingdojo.sportsApp.services;

import org.springframework.stereotype.Service;

import com.codingdojo.sportsApp.repositories.UserRepo;

@Service
public class UserService {
	
	private final UserRepo ur;
	
	public UserService(UserRepo ur) {
		this.ur = ur;
	}
	
	
}
