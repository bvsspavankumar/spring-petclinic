package com.kp.petclinicdata.services;

import java.util.Set;

import com.kp.petclinicdata.models.Owner;

public interface OwnerService {

	Owner findByLastName(String lastName);
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
}
