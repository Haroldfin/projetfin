package gcom.app.repos;

import java.util.List;

import gcom.app.entities.Profil;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ProfilRepos")
public interface ProfilRepos extends JpaRepository<Profil, Integer>{
	

	List<Profil> findByIdProfil(Integer id);
	
	List<Profil> findByNomProfil(String nom);
	
}
