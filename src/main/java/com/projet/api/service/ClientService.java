package com.projet.api.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projet.api.model.Client;
import com.projet.api.repository.ClientRepository;
import lombok.Data;


@Data
@Service
public class ClientService {
	

	@Autowired
	private ClientRepository clientRepository;

	public Optional<Client> getClient(final Long id) {
		return clientRepository.findById(id);
	}
	
	public Iterable<Client> getClients() {
		return clientRepository.findAll();
	}
	
	public void deleteClient(final Long id) {
		clientRepository.deleteById(id);
	}
	
	public Client saveClient(Client client) {
		Client savedClient = clientRepository.save(client);
		return savedClient;
	}
	
	

}
