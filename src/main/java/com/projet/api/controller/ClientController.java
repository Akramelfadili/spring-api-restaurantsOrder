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

import com.projet.api.model.Client;
import com.projet.api.service.ClientService;

@RestController
public class ClientController {
	

	@Autowired
	private ClientService clientService;
	
	/// save client
	@PostMapping("/client")
	public Client createClient(@RequestBody Client client) {
		return clientService.saveClient(client);
	}
	
	
	/// chercher un client par id 
	
	@GetMapping("/client/{id}")
	public Client getClient(@PathVariable("id") final Long id) {
		
		/*Optional<Client> client = clientService.getClient(id);
		if(client.isPresent()) {
			return client.get();
		} else {
			return null;
		}*/
		return new Client(465L,"client","clent","adress",4);
	}
	
	/// afficher tous les clients
	@GetMapping("/clients")
	public Iterable<Client> getClients() {
		return clientService.getClients();
	}
	
	//update un client
	
	@PutMapping("/client/{id}")
	public Client updateClient(@PathVariable("id") final Long id, @RequestBody Client client) {
		Optional<Client> e = clientService.getClient(id);
		if(e.isPresent()) {
			Client currentClient = e.get();
			
			String prenom = client.getPrenom();
			if(prenom != null) {
				currentClient.setPrenom(prenom);
			}
			String nom = client.getNom();
			if(nom != null) {
				currentClient.setNom(nom);;
			}
			String adresse = client.getAdresse();
			if(adresse != null) {
				currentClient.setAdresse(adresse);
			}
			int age = client.getAge();
			if(age != 0) {
				currentClient.setAge(age);
			}
			clientService.saveClient(currentClient);
			return currentClient;
		} else {
			return null;
		}
	}
	
	// delet
	@DeleteMapping("/client/{id}")
	public void deleteClient(@PathVariable("id") final Long id) {
		clientService.deleteClient(id);
	}
	

}
