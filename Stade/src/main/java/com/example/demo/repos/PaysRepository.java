package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.Pays;
@RepositoryRestResource(path = "pays")
@CrossOrigin(origins = "http://localhost:4200/")
public interface PaysRepository extends JpaRepository<Pays, Long> {

}
