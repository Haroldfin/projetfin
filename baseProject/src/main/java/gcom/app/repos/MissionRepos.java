package gcom.app.repos;


import gcom.app.entities.Mission;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository("MissionRepos")
public interface MissionRepos extends JpaRepository<Mission,Integer>{
	
	
	
	List<Mission> findByEndroitMission(String endroit);
	
	List<Mission> findByEtatMission(Boolean etat);
	
	@Query("from Mission where ID_Mission = :id")
	public Mission findMission(@Param("id") Integer id);
	
	@Modifying
	@Query("update Mission m set Id_Utilisateur = :idu where ID_Mission= :idm ")
	public boolean bindMissionUtilisateurRepos(@Param("idm") Integer idMission, @Param("idu")Integer idUser);
	
	@Modifying
	@Query("update Mission m set Id_Conducteur = :idc where ID_Mission= :idm ")
	public boolean bindMissionConducteurRepos(@Param("idm") Integer idMission, @Param("idc")Integer idconducteur);
	
	
}
