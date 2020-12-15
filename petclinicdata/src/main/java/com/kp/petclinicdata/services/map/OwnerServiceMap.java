package com.kp.petclinicdata.services.map;

import java.util.Set;

import com.kp.petclinicdata.models.Owner;
import com.kp.petclinicdata.services.OwnerService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long>
	implements OwnerService {

	public Set<Owner> findAll() {
		return super.findAll();
	}
	
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
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
