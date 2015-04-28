package gcom.test.repos;

import gcom.app.entities.Conducteur;
import gcom.app.repos.ConducteurRepos;
import gcom.app.service.IConducteurService;
import gcom.app.service.IMissionService;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.junit.After;
import org.junit.Before;
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
public class TestServiceConducteur {

	
	@Inject 
	IConducteurService conducteur;
	
	@Inject 
	IMissionService mission;	
	
	
	ConducteurRepos condu;
	
	private Long before , after;
	@Test
	public void test() {
		
			
			/////////////::::::::::AJOUTER  + UPDATE + DELETE CONDUCTEUR:::::::::::::\\\\\\\\\\\\\\\\\\\\\\\
			////////ajouter\\\\\\\\\
			
			//Conducteur condu1 = new Conducteur("nomConducteur12", "prenomConducteur12", "teleConducteur11", "emailConducteur12", "adresseConducteur11", new Date(),false);

			//conducteur.addConducteur(condu1);
		try{
			conducteur.deleteConducteur(12);
		}catch(Exception e){
			System.out.println(e);
		}
			//System.out.println("le nombre : " + conducteur.compterNombre("username2"));
			//delete conducteur
			/*
			conducteur.deleteConducteur(21);			
			*/
			/*
			//update conducteur et find conducteur par nom 
			Conducteur cond1 = conducteur.findConducteurByNom("username4");
			cond1.setEmailConducteur("chauffeur@gmail.com");
			conducteur.updateConducteur(cond1);
			*/
		
			/////////////////////// LA LISTE DES CONDUCTEURS \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
			/*
			List<Conducteur> conducteurs = conducteur.findAllConducteurs();
			for (Conducteur conducteur : conducteurs) {
				System.out.println("le nom : " + conducteur.getNomConducteur());
			}
			*/
			
			////////////////////// la liste des missions pour un conducteur \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
			
			//if(conducteur.findMissionForConducteurByid(15).isEmpty()){
			/*
			if(conducteur.findMissionForConducteurByname("username5").isEmpty()){
				System.out.println("la liste est vide");
			}else{
				System.out.println("la liste est remplie");
			}
			*/
		
		
		

	}
	
	@Before
	public void before() {
		System.out.println("\n\n\n\n-------------------------------------------------------------------\n");
		before = System.currentTimeMillis();
	}

	@After
	public void after() {
		System.out.println("\n-------------------------------------------------------------------\n\n\n\n");
		after = System.currentTimeMillis();
		System.out.println("\n\n  Temps: " + Long.toString(after - before) + " ms");
	}
}
