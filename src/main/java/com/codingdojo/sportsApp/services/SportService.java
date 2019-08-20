package com.codingdojo.sportsApp.services;

import org.springframework.stereotype.Service;

import com.codingdojo.sportsApp.repositories.SportRepo;

@Service
public class SportService {
	
	private final SportRepo sr;
	
	public SportService(SportRepo sr) {
		this.sr = sr;
	}
	
}
