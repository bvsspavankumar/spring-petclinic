package com.kp.petclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.kp.petclinic.models.Owner;
import com.kp.petclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long>
	implements OwnerService {

	public Set<Owner> findAll() {
		return super.findAll();
	}
	
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	public Owner save(Owner object) {
		return super.save(object);
	}
	
	public void delete(Owner object) {
		super.delete(object);
	}
	
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	public Owner findByLastName(String lastName) {
		return null;
	}
}
