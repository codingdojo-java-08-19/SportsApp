package com.codingdojo.sportsApp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.sportsApp.models.Sport;

public interface SportRepo extends CrudRepository<Sport,Long>{
	
}
