package com.projet.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "CommandeAnnuler")  

public class CommandeAnnuler {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_commande_annuler;
	
	private long Id_Commande;
	private long Id_Client;
	private String resto_name;
	private String description;
	
	public CommandeAnnuler() {
		
	}

	public CommandeAnnuler( long id_Commande, long id_Client, String resto_name,
			String description) {

		this.Id_Commande = id_Commande;
		this.Id_Client = id_Client;
		this.resto_name = resto_name;
		this.description = description;
	}

	public long getId_commande_annuler() {
		return id_commande_annuler;
	}

	public void setId_commande_annuler(long id_commande_annuler) {
		this.id_commande_annuler = id_commande_annuler;
	}

	public long getId_Commande() {
		return Id_Commande;
	}

	public void setId_Commande(long id_Commande) {
		Id_Commande = id_Commande;
	}

	public long getId_Client() {
		return Id_Client;
	}

	public void setId_Client(long id_Client) {
		Id_Client = id_Client;
	}

	public String getResto_name() {
		return resto_name;
	}

	public void setResto_name(String resto_name) {
		this.resto_name = resto_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
