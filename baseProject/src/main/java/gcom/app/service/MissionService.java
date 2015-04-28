package gcom.app.service;

import gcom.app.entities.Conducteur;
import gcom.app.entities.Mission;
import gcom.app.entities.Utilisateur;
import gcom.app.repos.MissionRepos;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("missionService")
@Transactional
public class MissionService implements IMissionService{

	@Inject
	MissionRepos mission;

	
	@Override
	public void addMission(Mission m , Utilisateur user , Conducteur cond) {
		m.setUtilisateur(user);
		m.setConducteur(cond);
		mission.save(m);
	}

	@Override
	public void deleteMission(Integer id) {
		mission.delete(id);
	}

	@Override
	public void updateMission(Mission m) {
		mission.saveAndFlush(m);
	}

	@Override
	public void bindMissionUtilisateur(Integer idmission, Integer iduser) {
		mission.bindMissionUtilisateurRepos(idmission, iduser);
	}

	@Override
	public void bindMissionConducteur(Integer idmission, Integer idconducteur) {
		mission.bindMissionConducteurRepos(idmission, idconducteur);

	}

	
	
	@Override
	public boolean findMission(Integer id) {
		if(mission.exists(id)){
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public Mission findAMission(Integer id){
		return mission.findMission(id); 
	}

	@Override
	public List<Mission> findMissionByEtat(Boolean etat){
		return mission.findByEtatMission(etat);
	} 

	@Override
	public List<Mission> findMissionByEndroit(String endroit) {
		return mission.findByEndroitMission(endroit);
	}

	@Override
	public void alerteEtatMission(Mission m) {
	
		if(m.getDateFinMission().after(new Date())==false){
			System.out.println("date fin mission depassé pour :" + m.getDescription());
		}else{
			System.out.println("Mission" + m.getIdMission() + "deja accomplie");
		}
	}
	
	@Override
	public void alerteDesMissions(){
		List<Mission> missions = this.findMissionByEtat(false);
		for (Mission mission : missions) {
			this.alerteEtatMission(mission);
		}
	}
	

}
