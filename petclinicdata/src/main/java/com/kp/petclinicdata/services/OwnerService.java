package com.kp.petclinicdata.services;

import com.kp.petclinicdata.models.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

	Owner findByLastName(String lastName);

}
