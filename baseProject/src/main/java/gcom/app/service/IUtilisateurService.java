package gcom.app.service;

import gcom.app.entities.Conducteur;
import gcom.app.entities.Departement;
import gcom.app.entities.Profil;
import gcom.app.entities.Utilisateur;

import java.util.List;

public interface IUtilisateurService {

	
	public void addUtilisateur(Utilisateur user , Departement depar , Profil pro);
	public void deleteUtilisateur(Integer  id);
	public void updateUtilisateur(Utilisateur user);
	public Utilisateur findUtilisateur(String nom);
	public List<Utilisateur> findAllUtilisateurs();
	public List<Utilisateur> findUtilisateurByDepartement(Integer idDepar);
	public List<Utilisateur> findUtilisateurByProfil(Integer idProfil);
	public void affecterUtilisateur(Integer idDepartement, Integer idUser);
	public void affecterUtilisateurParProfil(Integer idProfil, Integer idUser);
	public void addConducteurToProjectManager(Integer iduser , Integer idc);
	public List<Conducteur> listDriverForProjectManager(String nomUser);
	List<Conducteur> ListeConducteurDispoPourChefProjet(Integer id);
	Utilisateur findConducteurByNomAndPrenom(String nom, String prenom);

	
}
