package gcom.app.repos;

import gcom.app.entities.VehiculeGPS;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("VehiculeGPS")
public interface VehiculeGPSRepos extends JpaRepository<VehiculeGPS, Integer>{
	
}
