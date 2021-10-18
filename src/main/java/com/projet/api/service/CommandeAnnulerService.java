package com.projet.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.api.model.Commande;
import com.projet.api.model.CommandeAnnuler;
import com.projet.api.repository.CommandeAnnulerRepository;

import lombok.Data;

@Data
@Service
public class CommandeAnnulerService {

	

	@Autowired
	private CommandeAnnulerRepository commandeRepository;
	
	//aficher lees commande annuler 
	
	public Iterable<CommandeAnnuler> getCommandes() {
		return commandeRepository.findAll();
	}
	

	public void deleteCommande(final Long id) {
		commandeRepository.deleteById(id);
	}
	
	public CommandeAnnuler saveCommande(CommandeAnnuler commande) {
		CommandeAnnuler savedCommande = commandeRepository.save(commande);
		return savedCommande;
		
	}

	
	

}
