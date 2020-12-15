package com.kp.petclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.kp.petclinic.models.Pet;
import com.kp.petclinic.services.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long>
	implements PetService{

	public Set<Pet> findAll() {
		return super.findAll();
	}
	
	public Pet findById(Long id) {
		return super.findById(id);
	}
	
	public Pet save(Pet object) {
		return super.save(object);
	}
	
	public void delete(Pet object) {
		super.delete(object);
	}
	
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
