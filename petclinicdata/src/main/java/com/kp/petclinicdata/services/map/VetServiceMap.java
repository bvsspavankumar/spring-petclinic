package com.kp.petclinicdata.services.map;

import java.util.Set;

import com.kp.petclinicdata.models.Vet;
import com.kp.petclinicdata.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long>
	implements CrudService<Vet, Long>{

	public Set<Vet> findAll() {
		return super.findAll();
	}
	
	public Vet findById(Long id) {
		return super.findById(id);
	}
	
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}
	
	public void delete(Vet object) {
		super.delete(object);
	}
	
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
