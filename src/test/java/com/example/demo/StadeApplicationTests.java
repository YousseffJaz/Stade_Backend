package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Pays;
import com.example.demo.entities.Stade;
import com.example.demo.repos.StadeRepository;

@SpringBootTest
class StadeApplicationTests {
	
	@Autowired
	private StadeRepository stadeRepository;
	@Test
	public void testCreateProduit() {
	Stade stade = new Stade("PC Asus",1500.500,new Date());
	stadeRepository.save(stade);
	}
	

	@Test
	public void testUpdateStade()
	{
		Stade s = stadeRepository.findById(1L).get();
		s.setPrixStade(2000.0);
		stadeRepository.save(s);
	}
	
	@Test
	public void testDeleteStade()
	{
		stadeRepository.deleteById(1L);;
	}

	@Test
	public void testListerTousStades()
	{
		List<Stade> stades = stadeRepository.findAll();
		for (Stade s : stades)
		{
			System.out.println(s);
		}
	}
	
	@Test
	public void testFindStadeByNom(){
	
		List<Stade> stades = stadeRepository.findByNomStade("PC Asus");
		for (Stade s : stades)
		{
			System.out.println(s);
		}
	}
	
	
	@Test
	public void findByNomStadeContains(){
	
		List<Stade> stades = stadeRepository.findByNomStadeContains("P");
		for (Stade s : stades)
		{
			System.out.println(s);
		}
	}

	
	
	@Test
	public void testfindByNomPrix()
	{
	List<Stade> stades = stadeRepository.findByNomPrix("PC Asus", 1000.0);
	for (Stade s : stades)
	{
		System.out.println(s);
	}
	}
	
	
	@Test
	public void testfindByPays(){
		Pays pays = new Pays();
		pays.setIdPay(1L);
		List<Stade> stades = stadeRepository.findByPays(pays);
		for (Stade s : stades){
			System.out.println(s);
		}
	}
	
	@Test
	public void findByPaysIdPay(){
		List<Stade> stades = stadeRepository.findByPaysIdPay(1L);
		for (Stade s : stades){
			System.out.println(s);
		}
	 }
	
	@Test
	public void testfindByOrderByNomStadeAsc(){
		List<Stade> stades = stadeRepository.findByOrderByNomStadeAsc();
		for (Stade s : stades){
			System.out.println(s);
		}
	}
	
	
	@Test
	public void testTrierProduitsNomsPrix(){
		List<Stade> stades = stadeRepository.trierStadesNomsPrix();
		for (Stade s : stades){
			System.out.println(s);
		}
	}

}
