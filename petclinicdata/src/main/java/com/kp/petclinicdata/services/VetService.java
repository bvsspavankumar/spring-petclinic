package com.kp.petclinicdata.services;

import java.util.Set;

import com.kp.petclinicdata.models.Vet;

public interface VetService {
	
	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
}
