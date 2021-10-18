package com.projet.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projet.api.model.Commande;

import com.projet.api.service.CommandeService;

@RestController
public class CommandeController {
	
	@Autowired
	private CommandeService commandeService;
	
	// save 
	@PostMapping("/commande")
	public Commande createCommande(@RequestBody Commande commnade) {
		return commandeService.saveCommande(commnade);
	}
	
	/// get commande
	@GetMapping("/commande/{id}")
	public Commande getCommande(@PathVariable("id") final Long id) {
		Optional<Commande> commande = commandeService.getCommande(id);
		if(commande.isPresent()) {
			return commande.get();
		} else {
			return null;
		}
	}
	
	//a modifier pour chercher les commande de un id_user
	@GetMapping("/commandes")
	public Iterable<Commande> getCommandes() {
		return commandeService.getCommandes();
	}
	
	
	///Update
	@PutMapping("/commande/{id}")
	public Commande updateEmployee(@PathVariable("id") final Long id, @RequestBody Commande commande) {
		Optional<Commande> e = commandeService.getCommande(id);
		if(e.isPresent()) {
			Commande currentCommande = e.get();
			
			String pick_Adress = commande.getClient_adresse();
			if(pick_Adress != null) {
				currentCommande.setPickUp_adresse(pick_Adress);
			}
			
			String Client_adress = commande.getClient_adresse();
			if(Client_adress != null) {
				currentCommande.setClient_adresse(Client_adress);
			}
			
			String Etat = commande.getEtat();
			if(Etat != null) {
				currentCommande.setEtat(Etat);
			}
			
			String resto_name = commande.getResto_name();
			if(resto_name != null) {
				currentCommande.setResto_name(resto_name);
			}
			
			String Description = commande.getDescription();
			if(Description != null) {
				currentCommande.setDescription(Description);
			}
			
			int num = commande.getNum();
			if(num != 0) {
				currentCommande.setNum(num);
			}
			
			double prix = commande.getPrix();
			if(num != 0) {
				currentCommande.setPrix(prix);
			}
			
			Long id_client = commande.getId_Client();
			if(num != 0) {
				currentCommande.setId_Client(id_client);
			}
			
			commandeService.saveCommande(currentCommande);
			return currentCommande;
		} else {
			return null;
		}
	}
	
	
	
	/// delet
	@DeleteMapping("/commande/{id}")
	public void deleteCommande(@PathVariable("id") final Long id) {
		
		
		///save dans la table de annulation
		
		
		
		commandeService.deleteCommande(id);
	}
	
	// ajouter une methode de annuler une commande qui va changer l'ete et ajouter commande a la table 
	// des commandes annuler 
}
