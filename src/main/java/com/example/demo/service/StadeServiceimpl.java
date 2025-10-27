package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Pays;
import com.example.demo.entities.Stade;
import com.example.demo.repos.StadeRepository;


@Service
public class StadeServiceimpl implements StadeService{
	
	@Autowired
	StadeRepository stadeRepository ;
	@Override 
	public Stade saveStade(Stade s) {
		return stadeRepository.save(s);
	}

	@Override
	public Stade updateStade(Stade s) {
		return stadeRepository.save(s);

	}

	@Override
	public void deleteStade(Stade s) {
		stadeRepository.delete(s);
	}

	@Override
	public void deleteStadetById(Long id) {
		stadeRepository.deleteById(id);
	}

	@Override
	public Stade getStade(Long id) {
		return stadeRepository.findById(id).get();
	}

	@Override
	public List<Stade> getAllStades() {
		return stadeRepository.findAll();
	}

	@Override
	public List<Stade> findByNomStade(String nom) {

		return stadeRepository.findByNomStade(nom);
	}

	@Override
	public List<Stade> findByNomStadeContains(String nom) {
		return stadeRepository.findByNomStadeContains(nom);
	}

	@Override
	public List<Stade> findByNomPrix(String nom, Double prix) {
		return stadeRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Stade> findByPays(Pays pay) {
		return stadeRepository.findByPays(pay);
	}

	@Override
	public List<Stade> findByPaysIdPay(Long id) {
		return stadeRepository.findByPaysIdPay(id);
	}

	@Override
	public List<Stade> findByOrderByNomStadeAsc() {
		return stadeRepository.findByOrderByNomStadeAsc();
	}

	@Override
	public List<Stade> trierStadesNomsPrix() {
		return stadeRepository.trierStadesNomsPrix();
	}

}
