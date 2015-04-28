package gcom.test.repos;

import gcom.app.entities.Conducteur;
import gcom.app.entities.Departement;
import gcom.app.entities.Profil;
import gcom.app.entities.Utilisateur;
import gcom.app.repos.ConducteurRepos;
import gcom.app.repos.UtilisateurRepos;
import gcom.app.service.IConducteurService;
import gcom.app.service.IDepartementService;
import gcom.app.service.IProfilService;
import gcom.app.service.IUtilisateurService;
import gcom.app.service.UtilisateurService;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:META-INF/spring/applicationContext-data.xml",
		 "classpath*:META-INF/spring/applicationContext.xml" })
@Transactional
@TransactionConfiguration(defaultRollback = false)
public class TestUtilisateur {

	@Inject 
	IUtilisateurService user;
	@Inject
	IConducteurService cond;
	@Inject
	IDepartementService depar;
	@Inject
	IProfilService iprofil;
	
	@Test
	public void test() {
		try{
			
			///////// ajouter un utilisateur  + Update + Delete \\\\\\\\\\\\\\\\\
			/*
			Utilisateur user1 = new Utilisateur("login", "motDePasse", "nomUtilisateur", "prenomUtilisateur", 
					"teleUtilisateur", "emailUtilisateur"," photo");
					user.addUtilisateur(user1);
			*/
			/*
			Utilisateur user1 = user.findUtilisateur("nomUtilisateur");
			user1.setLogin("Harold");
			user.updateUtilisateur(user1);
			*/
			/*
			Utilisateur user1 = user.findUtilisateur("nomUtilisateur1");
			user.deleteUtilisateur(user1.getIdUtilisateur());
			*/
			
			
			/*
			Utilisateur user1 = user.findUtilisateur("nomUtilisateur1"); 
			
			System.out.println("le prenom :" + user1.getPrenomUtilisateur());
		
			List<Utilisateur> utilisateurs = user.findUtilisateurByDepartement(6);
			for (Utilisateur utilisateur : utilisateurs) {
				System.out.println("le nom : " + utilisateur.getIdUtilisateur());
			}
			*/
			////////////// la liste des conducteurs d'un chef de projet donnée \\\\\\\\\\\\\\
			/*
			List<Conducteur> conducteurs =  user.listDriverForProjectManager("nomUtilisateur1");
			for (Conducteur conducteur : conducteurs) {
				System.out.println("le nom : " + conducteur.getNomConducteur());
			}
			*/
			/////////////// test find utilisateur par le nom ou prenom \\\\\\\\\\\\\\\\\\\\\
			/*
			Utilisateur user1 = user0.findUtilisateur("nomUtilisateur5");
			System.out.println("le login :"+user1.getLogin() +"le mot de passe:"+user1.getMotDePasse());
			*/
			//////////////// affecter conducteur un conducteur à un chef de projet \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
				/*
			Conducteur cond1 = new Conducteur(); 
			cond1 = cond.findConducteurByNom("username4");
			System.out.println("l'email :"+cond1.getEmailConducteur() +"tele:"+cond1.getTeleConducteur());
			
			/////////////////// Affecter conducteur à un chef de projet \\\\\\\\\\\\\\\\\\\\\\\\
		
			Utilisateur user1 = user.findUtilisateur("nomUtilisateur5");
			//Conducteur cond1 = cond.findConducteurByNom("username4");
			user.addConducteurToProjectManager(user1.getIdUtilisateur(),cond1.getIdConducteur()) ;
		
			*/
			/*
			List<Utilisateur> users = user.findAllUtilisateurs(); 
			for (Utilisateur utilisateur : users) {
				System.out.println("le nom :"+ utilisateur.getNomUtilisateur()+"le prenom : "+utilisateur.getPrenomUtilisateur());
			}
			*/
			
			//////////// liste utilisateurs par departement \\\\\\\\\\\\\\\\\\\\\\
			/*
			List<Utilisateur> users = user.findUtilisateurByDepartement(6);
			for (Utilisateur utilisateur : users) {
				System.out.println("le nom :"+utilisateur.getNomUtilisateur()+ "le prenom :"+ utilisateur.getPrenomUtilisateur());
			}
			*/
			
			//////////////////// liste des utilisateurs par profil \\\\\\\\\\\\\\\\\\\\
			/*
			List<Utilisateur> users =  user.findUtilisateurByProfil(5);
			for (Utilisateur utilisateur : users) {
				System.out.println("le nom : " + utilisateur.getNomUtilisateur());			
			}
			*/
			
			/////////////////// affecter utilisateur a un departement et un role \\\\\\\\\\\\\\\\\\\\
			/*
			Utilisateur user1 = user.findUtilisateur("nomUtilisateur2");
			System.out.println("l'id de l'utilisateur :" + user1.getIdUtilisateur());
			user.affecterUtilisateur(7,user1.getIdUtilisateur());
			user.affecterUtilisateurParProfil(5, user1.getIdUtilisateur());
			*/
			
			/////////////////////la liste des conducteurs disponible d'un chef de projet \\\\\\\\\\\\\\\\\\\\\\
			/*
			List<Conducteur> conducteurs = user.ListeConducteurDispoPourChefProjet(10);
			for (Conducteur conducteur : conducteurs) {
				System.out.println("le nom du conducteur dispo : " + conducteur.getNomConducteur());
			}
			*/
			/////////////// find user by name and last name \\\\\\\\\\\\\\\\\\\
			/*
			Utilisateur user0 = user.findConducteurByNomAndPrenom("nomUtilisateur1", "prenomUtilisateur1");
			System.out.println("login :" + user0.getLogin() + "mot de passe : " + user0.getMotDePasse());
			*/

			
		}catch(Exception e){
			System.out.println("Erreur Utilisateur   " + e);
		}
		
	}
}
