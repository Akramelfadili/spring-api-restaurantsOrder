package com.projet.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "commandes")  

public class Commande {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Commande;
	// cle etranger  §§§!
	@Column(name="Id_Client")
	private Long Id_Client;
	@Column(name="resto_name")
	private String resto_name;
	
    
	@Column(name="pickUp_adresse")
	private String pickUp_adresse ;
	
	@Column(name="Client_adresse")
	private String Client_adresse ;
	
	@Column(name="description")
	private String description ;
	
	@Column(name="prix")
	private double prix ;
	
	@Column(name="num")
	private int num ;
	
	@Column(name="Etat")
	private String Etat;
	
	
	public Commande() {
		
	}

	public Long getId_Commande() {
		return Id_Commande;
	}

	public void setId_Commande(Long id_Commande) {
		Id_Commande = id_Commande;
	}

	public Long getId_Client() {
		return Id_Client;
	}

	public void setId_Client(Long id_Client) {
		Id_Client = id_Client;
	}

	public String getId_menu() {
		return resto_name;
	}

	public void setId_menu(	String resto_name) {
		this.resto_name = resto_name;
	}

	public String getPickUp_adresse() {
		return pickUp_adresse;
	}

	public void setPickUp_adresse(String pickUp_adresse) {
		this.pickUp_adresse = pickUp_adresse;
	}

	public String getClient_adresse() {
		return Client_adresse;
	}

	public void setClient_adresse(String client_adresse) {
		Client_adresse = client_adresse;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getEtat() {
		return Etat;
	}

	public void setEtat(String etat) {
		Etat = etat;
	}

	public Commande(Long id_Commande, Long id_Client, String resto_name, String pickUp_adresse, String client_adresse,
			String description, double prix, int num, String etat) {
		
		this.Id_Commande = id_Commande;
		this.Id_Client = id_Client;
		this.resto_name = resto_name;
		this.pickUp_adresse = pickUp_adresse;
		this.Client_adresse = client_adresse;
		this.description = description;
		this.prix = prix;
		this.num = num;
		this.Etat = etat;
	}

	
	

}
	
	
	
