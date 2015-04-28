package gcom.app.service;

import gcom.app.entities.Conducteur;
import gcom.app.entities.Mission;
import gcom.app.entities.Utilisateur;

import java.util.List;

public interface IMissionService {
	
	public void addMission(Mission m , Utilisateur user , Conducteur cond);
	public void deleteMission(Integer id);
	public void updateMission(Mission m);
	public boolean findMission(Integer id);
	public Mission findAMission(Integer id);
	public void bindMissionUtilisateur(Integer idmission,Integer iduser);
	public void bindMissionConducteur(Integer idmission,Integer idconducteur);
	public List<Mission> findMissionByEtat(Boolean etat); 
	public List<Mission> findMissionByEndroit(String endroit);
	public void alerteEtatMission(Mission m);
	public void alerteDesMissions();
	
}
