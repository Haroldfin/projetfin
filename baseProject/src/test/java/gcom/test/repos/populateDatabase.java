package gcom.test.repos;

import gcom.app.entities.Conducteur;
import gcom.app.entities.Condveh;
import gcom.app.entities.Departement;
import gcom.app.entities.GPS;
import gcom.app.entities.Historique;
import gcom.app.entities.MarqueVehicule;
import gcom.app.entities.Mission;
import gcom.app.entities.Profil;
import gcom.app.entities.Utilisateur;
import gcom.app.entities.Vehicule;
import gcom.app.entities.VehiculeGPS;
import gcom.app.repos.CondVehRepos;
import gcom.app.repos.ConducteurRepos;
import gcom.app.repos.DepartementRepos;
import gcom.app.repos.GpsRepos;
import gcom.app.repos.HistoriqueRepos;
import gcom.app.repos.MarqueVehiculeRepos;
import gcom.app.repos.MissionRepos;
import gcom.app.repos.ProfilRepos;
import gcom.app.repos.UtilisateurRepos;
import gcom.app.repos.VehiculeGPSRepos;
import gcom.app.repos.VehiculeRepos;

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
public class populateDatabase {

	
	@Inject 
	VehiculeRepos vehiculeRepos;
	@Inject 
	VehiculeGPSRepos vehiculeGpsRepos;
	@Inject
	MarqueVehiculeRepos marqueVehiculeRepos;
	@Inject
	GpsRepos gpsRepos;
	@Inject
	VehiculeGPSRepos vehiculegpsRepos;
	@Inject
	HistoriqueRepos historiqueRepos;
	@Inject
	ProfilRepos profils;
	@Inject
	MarqueVehiculeRepos marque;
	@Inject
	MissionRepos mission;
	@Inject
	DepartementRepos depar;
	@Inject
	UtilisateurRepos user;
	@Inject 
	ConducteurRepos condu;
	@Inject
	VehiculeRepos vehicule;
	@Inject
	CondVehRepos condvehRepos;
	
	long before, after;


	@Test
	public void test() {
		
		//ADD Conducteur
		try {
			for (int i = 1; i <= 10; i++) {
				Conducteur condu1 = new Conducteur("username" + i , "prenomConducteur" +i, "teleConducteur" +i, "emailConducteur"+i, "adresseConducteur"+i, new Date(),false,false);
				condu.save(condu1);
			}
		} catch (Exception e) {
			System.out.println("ERROR --> Creating conducteurs");
		}
		//ADD Departement
		try {
			for (int i = 1; i <= 5; i++) {
				Departement depar1 = new Departement("intituleDepartement" +i);
				depar.save(depar1);
			}
		} catch (Exception e) {
			System.out.println("ERROR --> Creating departement");
		}
		//ADD PROFIL
		try {
			for (int i = 1; i <= 3; i++) {
				Profil profil1 = new Profil("nomProfil"+i);
				profils.save(profil1);
			}
		} catch (Exception e) {
			System.out.println("ERROR --> Creating profils");
		}

		
		//ADD UTILISATEUR
		try {
			for (int i = 1; i <= 5; i++) {
				Utilisateur user1 = new Utilisateur("login"+i, "motDePasse"+i, "nomUtilisateur"+i, "prenomUtilisateur"+i, "teleUtilisateur"+i, "emailUtilisateur"+i, "photo"+i);
				user1.setDepartement(depar.findOne(i));
				user1.setProfil(profils.findOne(1));
				user.save(user1);
			}
		} catch (Exception e) {
			System.out.println("ERROR --> Creating utilisateurs");
		}
		
		//ADD MISSION
		try {
			for (int i = 1; i <= 10; i++) {
				Mission mission1 = new Mission("description"+i, new Date(), new Date(), "endroitMission"+i, true);
				mission1.setConducteur(condu.findOne(i));
				mission1.setUtilisateur(user.findOne(i));
				mission.save(mission1);
			}
		} catch (Exception e) {
			System.out.println("ERROR --> Creating mission");
		}

		//test Marque
		try{
			for(int i=0 ; i<5 ; i++)
			{
				MarqueVehicule marque = new MarqueVehicule("marque"+i);
				marqueVehiculeRepos.save(marque);
			} 
			
		}
		catch(Exception e){
			System.out.println("==> Error Marque ");
		}
		
		//test vehicule
		try{ 
			MarqueVehicule marque = marqueVehiculeRepos.findOne(3);
			
			Vehicule vehicule = new Vehicule("123 b 26",new Date());
			vehicule.setMarque(marque);
			
			vehiculeRepos.save(vehicule);
			
		}
		catch(Exception e){
			System.out.println("==> Error vehicule ");
		}
	
		//test GPS
		try{
			for(int i =0 ; i<5 ; i++)
			{
				GPS gps = new GPS("061200"+i+i,"gps X1","123",false);
				gpsRepos.save(gps);
			}
		}
		catch(Exception e){
			System.out.println("==> Error vehicule ");
		}
		
		//test Vehicule_GPS
		try{
			
			Vehicule vehicule = vehiculeRepos.findOne(2);
			GPS gps = gpsRepos.findOne(1);
			
			VehiculeGPS vehiculeGps = new VehiculeGPS(vehicule,gps,new Date());
			vehiculegpsRepos.save(vehiculeGps); 
		}
		catch(Exception e){
			System.out.println("==> Error vehicule GPS");
		}
	
		//test Historique
		try{
			 Vehicule vehicule = vehiculeRepos.findOne(2);
			
			Historique historique = new Historique(120,108,176,145,"marrakech",12,true,new Date());
			historique.setVehicule(vehicule);
			
			historiqueRepos.save(historique); 
		}catch(Exception e){
			System.out.println("==> Error Historique");
		}
		
		//join conducteur à vehicule
		//ADD Conducteur Vehicule
   
		try {
                
            Conducteur conducteur = condu.findOne(2);
            Vehicule vehicule = vehiculeRepos.findOne(2);
            Condveh condVeh = new Condveh(new Date(),conducteur,vehicule);
            
            condvehRepos.save(condVeh);
            
        } catch (Exception e) {
            System.out.println("ERROR --> Creating conducteur vehicule");
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
