package com.kp.petclinic.services;

import com.kp.petclinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

	Owner findByLastName(String lastName);

}
