package com.kp.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kp.petclinic.services.VetService;

@Controller
public class VetController {
	
	private final VetService vs;
	
	public VetController(VetService vs) {
		super();
		this.vs = vs;
	}

	@RequestMapping("/vets")
	public String listVets(Model model) {
		model.addAttribute("vets", vs.findAll());
		return "vets/index";
	}
}
