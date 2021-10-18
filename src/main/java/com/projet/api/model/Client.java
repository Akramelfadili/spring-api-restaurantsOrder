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
@Table(name = "clients")  
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_Client ;
	
	@Column(name="nom")
	private String nom ;
	
	@Column(name="prenom")
	private String prenom ;
	
	@Column(name="adresse")
	private String adresse ;
	
	@Column(name="age")
	private int age ;
	
	
	public Client(Long id_Client, String nom, String prenom, String adresse, int age) {
		
		this.id_Client = id_Client;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.age = age;
	}
	
	public Client() {
		
	}
	public Long getId_Client() {
		return id_Client;
	}
	public void setId_Client(Long id_Client) {
		this.id_Client = id_Client;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


}
