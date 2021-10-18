package com.projet.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.projet.api.model.Commande;

public interface CommandeRepository extends CrudRepository<Commande, Long> {

}
