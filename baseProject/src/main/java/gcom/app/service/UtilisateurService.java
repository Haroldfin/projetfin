package gcom.app.service;

import gcom.app.entities.Conducteur;
import gcom.app.entities.Departement;
import gcom.app.entities.Profil;
import gcom.app.entities.Utilisateur;
import gcom.app.repos.UtilisateurRepos;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("utilisateurService")
@Transactional
public class UtilisateurService implements IUtilisateurService{

	@Inject
	UtilisateurRepos utilisateur;

	//////////////////////////// deja tester \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	@Override
	public void addUtilisateur(Utilisateur user , Departement depar , Profil pro) {
		user.setDepartement(depar);
		user.setProfil(pro);
		utilisateur.save(user);
	}

	//////////////////////////// deja tester \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	@Override
	public void deleteUtilisateur(Integer id) {
		if(utilisateur.findByMissionUtilisateurId(id).isEmpty()){
			System.out.println("Chef de projet n'a pas de mission");
		}else{
			System.out.println("les missions du ched de projet sont tous suprimées");
			utilisateur.deleteAllMissionOfUtilisateur(id);
		}
		utilisateur.delete(id);
	}

	//////////////////////////// deja tester \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	@Override
	public void updateUtilisateur(Utilisateur user) {
		utilisateur.saveAndFlush(user);
	}
	
	//////////////////////////// deja tester \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	@Override
	public Utilisateur findUtilisateur(String nom) {
		return utilisateur.findByNomUtilisateurOrPrenomUtilisateur(nom);	
	}
	//////////// deja tester \\\\\\\\\\\\\\\\\\
	@Override
	public List<Utilisateur> findAllUtilisateurs() {
		return utilisateur.findAll();
	}
	//////////// deja tester \\\\\\\\\\\\\\\\
	@Override
	public List<Utilisateur> findUtilisateurByDepartement(Integer idDepar) {
		return utilisateur.findByDepartement(idDepar);
	}

	//////////////////::::deja tester::::::\\\\\\\\\\\\\\\\\\\\\\\\\
	@Override
	public List<Utilisateur> findUtilisateurByProfil(Integer idProfil) {
		return utilisateur.findByProfil(idProfil); 
	}

	/////////////////// deja tester \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	@Override
	public void affecterUtilisateur(Integer idDepartement, Integer idUser) {
		utilisateur.affecterUtilisateurDepartement(idDepartement,idUser);
	}
	
	/////////////////// deja tester \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

	@Override
	public void addConducteurToProjectManager(Integer iduser, Integer idc) {
		 utilisateur.addConducteurToProjectManagerRepos(iduser, idc);
	}
	//////////////////////// deja tester \\\\\\\\\\\\\\\\\\\\\\\
	@Override
	public List<Conducteur> listDriverForProjectManager(String nomUser) {
		return utilisateur.ListConducteursChefdeProjet(nomUser);
	}

	/////////////////////// deja tester \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	@Override
	public void affecterUtilisateurParProfil(Integer idProfil, Integer idUser) {
		utilisateur.affecterUtilisateurProfil(idProfil, idUser);
	}
	
	//////////////////////// deja tester \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	@Override
	public List<Conducteur> ListeConducteurDispoPourChefProjet(Integer id) {
		return utilisateur.ListConduDispo(id);
	}
	
	
	////////////////////////deja tester \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	@Override
	public Utilisateur findConducteurByNomAndPrenom(String nom , String prenom){
		Utilisateur user = utilisateur.findByNomUtilisateurAndPrenomUtilisateur(nom, prenom);
		return user;
	}


}
