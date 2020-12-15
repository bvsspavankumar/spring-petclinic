package com.kp.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kp.petclinic.services.OwnerService;

@Controller
public class OwnerController {
	
	private final OwnerService os;
	
	public OwnerController(OwnerService os) {
		super();
		this.os = os;
	}

	@RequestMapping("/owners")
	public String listowners(Model model) {
		model.addAttribute("owners", os.findAll());
		return "owners/index";
	}
}
