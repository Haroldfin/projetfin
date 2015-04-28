package gcom.app.repos;

import gcom.app.entities.Vehicule;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("VehiculeRepos")
public abstract interface VehiculeRepos extends JpaRepository<Vehicule, Integer>{
	
	Vehicule findByMatricule(String matricule);
	
	List<Vehicule> findByDateAcquisition(Date date_acquisition);
	
	List<Vehicule> findByDateAssurance(Date dateassurance);
	
	List<Vehicule> findByDateTaxe(Date datetaxe);
	
	List<Vehicule> findByEtatTaxe(boolean etat);
	
	List<Vehicule> findByEtatAssurance(boolean etat);
	
	List<Vehicule> findByEtatVehiculeCond(boolean etat);
	
	List<Vehicule> findByEtatVehiculeGps(boolean etat);
	
	List<Vehicule> findByEtatVehiculeGpsFalse();
	
	List<Vehicule> findByEtatVehiculeCondFalse();
}
