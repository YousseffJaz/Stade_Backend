package com.example.demo.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity

public class Stade {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idStade;
	private String nomStade;
	private Double prixStade;
	private Date dateCreation;
	
	@ManyToOne
	private Pays pays;
	
	
	public Pays getPays() {
		return pays;
	}


	public void setPays(Pays pays) {
		this.pays = pays;
	}


	public Stade() {
		super();
	}
	
	
	public Stade(String nomStade, Double prixStade, Date dateCreation) {
		super();
		this.nomStade = nomStade;
		this.prixStade = prixStade;
		this.dateCreation = dateCreation;
	}


	@Override
	public String toString() {
		return "Stade [idStade=" + idStade + ", nomStade=" + nomStade + ", prixStade=" + prixStade + ", dateCreation="
				+ dateCreation + "]";
	}


	public Long getIdStade() {
		return idStade;
	}
	public void setIdStade(Long idStade) {
		this.idStade = idStade;
	}
	public String getNomStade() {
		return nomStade;
	}
	public void setNomStade(String nomStade) {
		this.nomStade = nomStade;
	}
	public Double getPrixStade() {
		return prixStade;
	}
	public void setPrixStade(Double prixStade) {
		this.prixStade = prixStade;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	
	

}
