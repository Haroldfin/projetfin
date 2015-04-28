package gcom.app.repos;

import gcom.app.entities.Conducteur;
import gcom.app.entities.Mission;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("ConducteurRepos")
public interface ConducteurRepos extends JpaRepository<Conducteur, Integer>{
	
	
	Long countByNomConducteur(String nom);
		
	@Query("from Conducteur where Nom_Conducteur = :nom")
	public Conducteur findNomConducteur(@Param("nom") String nom);
		
	@Query("from Mission where Id_Conducteur in (from Conducteur where Nom_Conducteur = :nom)")
	public List<Mission> findByMissionConducteurName(@Param("nom") String nom);
	
	@Query("from Mission where Id_Conducteur = :id")
	public List<Mission> findByMissionConducteurId(@Param("id") Integer id);
	
	@Modifying
	@Query("delete from Mission where 	Id_Conducteur = :id")
	public void deleteAllMissionOfConducteur(@Param("id") Integer id);
	
}
