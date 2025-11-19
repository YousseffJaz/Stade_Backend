package com.example.demo.repos;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Pays;
import com.example.demo.entities.Stade;
@RepositoryRestResource(path = "rest")
public interface StadeRepository extends JpaRepository<Stade, Long> {
	
	List<Stade> findByNomStade (String nom);
	List<Stade> findByNomStadeContains (String nom);
	
	/*@Query("select s from Stade s where s.nomStade like %?1 and s.prixStade > ?2")
	List<Stade> findByNomPrix (String nom, Double prix);*/
	
	@Query("select s from Stade s where s.nomStade like %:nom and s.prixStade > :prix")
	List<Stade> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);
	
	@Query("select s from Stade s where s.pays = ?1")
	List<Stade> findByPays (Pays pays);
	
	List<Stade> findByPaysIdPay(Long id);
	List<Stade> findByOrderByNomStadeAsc();
	
	@Query("select s from Stade s order by s.nomStade ASC, s.prixStade DESC")
	List<Stade> trierStadesNomsPrix ();


}
