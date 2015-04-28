package gcom.app.repos;

import gcom.app.entities.GPS;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("GPS")
public interface GpsRepos extends JpaRepository<GPS, Integer>{
	
}
