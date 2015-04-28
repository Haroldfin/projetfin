package gcom.app.repos;

import gcom.app.entities.Departement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("DepartementRepos")
public interface DepartementRepos extends	JpaRepository<Departement, Integer>{
	
	Departement findByIntituleDepartement(String nom);
	
			
}
