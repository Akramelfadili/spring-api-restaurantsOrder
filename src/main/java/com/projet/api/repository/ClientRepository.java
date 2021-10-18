package com.projet.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.projet.api.model.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {

}
