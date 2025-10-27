package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Pays;
import com.example.demo.entities.Stade;

public interface StadeService {

	Stade saveStade(Stade s);
	Stade updateStade(Stade s);
	void deleteStade(Stade s);
	 void deleteStadetById(Long id);
	 Stade getStade(Long id);
	List<Stade> getAllStades();
	List<Stade> findByNomStade(String nom);
	List<Stade> findByNomStadeContains(String nom);
	List<Stade> findByNomPrix (String nom, Double prix);
	List<Stade> findByPays (Pays pay);
	List<Stade> findByPaysIdPay(Long id);
	List<Stade> findByOrderByNomStadeAsc();
	List<Stade> trierStadesNomsPrix();
}
