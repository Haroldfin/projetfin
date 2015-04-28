package gcom.app.service;

import gcom.app.entities.Conducteur;
import gcom.app.entities.Mission;

import java.util.List;


public interface IConducteurService {
	
	public void addConducteur(Conducteur c);
	public void deleteConducteur(Integer id);
	public void updateConducteur(Conducteur c);
	public List<Conducteur> findAllConducteurs();
	public Long compterNombre(String nom);
	public Conducteur findConducteurByNom(String nom);
	public List<Mission> findMissionForConducteurByname(String nom);
	public List<Mission> findMissionForConducteurByid(Integer id);

	
}
