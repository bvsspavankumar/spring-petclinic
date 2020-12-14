package com.kp.petclinicdata.services;

import java.util.Set;

import com.kp.petclinicdata.models.Pet;

public interface PetService {
	
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
}
