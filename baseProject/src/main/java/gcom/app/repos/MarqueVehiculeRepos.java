package gcom.app.repos;

import gcom.app.entities.MarqueVehicule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("MarqueVehicule")
public interface MarqueVehiculeRepos extends JpaRepository<MarqueVehicule,Integer>{

	
}
