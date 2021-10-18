package com.projet.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.projet.api.model.CommandeAnnuler;
import com.projet.api.service.CommandeAnnulerService;

@RestController
public class CommandeAnnulerController {
	
	@Autowired
	private CommandeAnnulerService commandeService;
	
	
	@GetMapping("/commandesAnnuler")
	public Iterable<CommandeAnnuler> getCommandes() {
		
		return commandeService.getCommandes();
		
	}
	
	@PostMapping("/commandeAnnuler")
	public CommandeAnnuler createCommande(@RequestBody CommandeAnnuler commnade) {
		
		
		return commandeService.saveCommande(commnade);
	}
	
	@DeleteMapping("/commandeAnnuler/{id}")
	public void deleteCommande(@PathVariable("id") final Long id) {
		
		
		commandeService.deleteCommande(id);
	}
}
