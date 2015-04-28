package gcom.app.service;

import gcom.app.entities.Conducteur;
import gcom.app.entities.Mission;
import gcom.app.repos.ConducteurRepos;
import gcom.app.repos.MissionRepos;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("conducteurService")
@Transactional
public class ConducteurService implements IConducteurService{

	@Inject
	ConducteurRepos condu;
	
	@Inject 
	MissionRepos mission;
	
	///////////////////// DEJA TESTER \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	@Override
	public void addConducteur(Conducteur c) {
		condu.save(c);
	}
	///////////////////// DEJA TESTER \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	@Override
	public void deleteConducteur(Integer id) {
		
		if(condu.findOne(id) != null){
			if(this.findMissionForConducteurByid(id).isEmpty()){
				System.out.println("Conducteur n'a pas de mission ");
			}else{
				condu.deleteAllMissionOfConducteur(id);
			}
			condu.delete(id);
		}else{
			System.out.println("Conducteur n'existe pas !!");
		}
	}

	///////////////////// DEJA TESTER \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	@Override
	public void updateConducteur(Conducteur c) {
		condu.saveAndFlush(c);
	}

	///////////////////// DEJA TESTER \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	@Override
	public List<Conducteur> findAllConducteurs() {
		return condu.findAll();	
	}

	///////////////////// DEJA TESTER \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	@Override
	public Conducteur findConducteurByNom(String nom) {
		return condu.findNomConducteur(nom);
	}
	
	///////////////////// DEJA TESTER \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	@Override
	public List<Mission> findMissionForConducteurByid(Integer id) {	
		return condu.findByMissionConducteurId(id);
	}
	///////////////////// DEJA TESTER \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	@Override
	public List<Mission> findMissionForConducteurByname(String nom) {
		return condu.findByMissionConducteurName(nom);
	}
	///////////////////// DEJA TESTER \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	@Override 
	public Long compterNombre(String nom){
		return condu.countByNomConducteur(nom);
	}
	
	
}
