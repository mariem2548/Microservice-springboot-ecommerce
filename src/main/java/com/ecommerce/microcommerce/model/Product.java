package com.ecommerce.microcommerce.model;

//import com.fasterxml.jackson.annotation.JsonFilter;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
//@JsonFilter("monFiltreDynamique")

@Entity
public class Product {
	@Id
    private int id;
	@Size(min = 3 , max= 25 )
    private String nom;
	@Min(value = 1)
    private int prix;
    private int prixAchat;

    public Product() {
    }

    public Product(int id, String nom, int prix, int prixAchat) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.prixAchat = prixAchat;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(int prixAchat) {
		this.prixAchat = prixAchat;
	}
	
	public String toString() {
		return "Product{"+
	"id=" + id + 
	", nom = '" + nom + '\'' + 
	", prix=" + prix + 
	'}';
	}

   
}