package gcom.test.repos;

import gcom.app.entities.Conducteur;
import gcom.app.entities.Mission;
import gcom.app.entities.Utilisateur;
import gcom.app.service.IConducteurService;
import gcom.app.service.IMissionService;
import gcom.app.service.IUtilisateurService;

import java.util.Date;

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
public class TestServiceMission {

	@Inject
	IMissionService mission;
	@Inject 
	IUtilisateurService user;
	@Inject
	IConducteurService cond;
	
	private Long before , after;
	@Test
	public void test() {
			///////////////////////:::::::test Mission:::::::::::\\\\\\\\\\\\\\\\\\\\\\\
			try{
				////////---------------------ajouter + update + delete + mission---------------------------\\\\\\\\\\\
//			Mission mis = new Mission("description", new Date(),new Date(), "endroitMission", false);
//			Utilisateur user0 = user.findConducteurByNomAndPrenom("nomUtilisateur1","prenomUtilisateur1" );
//			Conducteur cond0 = cond.findConducteurByNom("username3");
			
			//mission.deleteMission(21);
				/*
			Mission mis = mission.findAMission(12);
			System.out.println("description :" + mis.getDescription());
				*/
				//////affecter mission a un utilisateur\\\\\\\
			/*
			if(mission.bindMissionUtilisateur(8, 3)==true){
				System.out.println("Affectation réussie");
			}else{
				System.out.println("Affectation non réussie");
			}
			*/
			
			////////////afficher les listes des missions \\\\\\\\\\\\\\
			/*	
			 List<Mission> missions =  mission.findMissionByEtat(true);
			 List<Mission> missionsend = mission.findMissionByEndroit("endroitMission1");
			 for (Mission mission : missions) {
				System.out.println("description: " + mission.getDescription() );
			 }
			 for (Mission mission : missionsend) {
				 System.out.println("description: " + mission.getDescription() );
			}
			*/
				
				
			
			}catch(Exception e){
			System.out.println(""+e);
			}		
			
			
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
