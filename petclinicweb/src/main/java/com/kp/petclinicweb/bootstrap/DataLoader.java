package com.kp.petclinicweb.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kp.petclinicdata.models.Owner;
import com.kp.petclinicdata.models.Vet;
import com.kp.petclinicdata.services.OwnerService;
import com.kp.petclinicdata.services.PetService;
import com.kp.petclinicdata.services.VetService;
import com.kp.petclinicdata.services.map.OwnerServiceMap;
import com.kp.petclinicdata.services.map.PetServiceMap;
import com.kp.petclinicdata.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService os;
	private final VetService vs;
	private final PetService ps;
	
	public DataLoader() {
		os = new OwnerServiceMap();
		vs = new VetServiceMap();
		ps = new PetServiceMap();
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Owner o1 = new Owner();
		o1.setFirstName("Ajit");
		o1.setLastName("K");
		o1.setId(1L);
		os.save(o1);
		
		Owner o2 = new Owner();
		o2.setFirstName("Bhavya");
		o2.setLastName("L");
		o2.setId(2L);
		os.save(o2);
		
		System.out.println("Loaded owners");
		
		Vet v1 = new Vet();
		v1.setFirstName("Chaitu");
		v1.setLastName("Q");
		v1.setId(1L);
		vs.save(v1);
		
		System.out.println("Loaded vets");
		
		System.out.println("Owners: "+os.findAll().size());
		System.out.println("Vets: "+vs.findAll().size());
		System.out.println("Pets: "+ps.findAll().size());
	}

	
}
