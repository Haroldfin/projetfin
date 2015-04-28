package gcom.test.repos;

import gcom.app.entities.Departement;
import gcom.app.entities.Profil;
import gcom.app.service.IDepartementService;
import gcom.app.service.IProfilService;

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
public class TestServiceProfilDepartement {
	@Inject
	IProfilService profil;
	@Inject
	IDepartementService depar;

	
	Long before,after;
	//////////////////////////// PROFIL \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	/*
	@Test
	public void test(){
		try{
			List<Profil> profils = profil.findAllProfils();
			for (Profil profil : profils) {
				System.out.println("id profil : " + profil.getIdProfil() + " nom porfil : " +profil.getNomProfil() );
			}

		}catch(Exception e){
			System.out.println(e);
		}
	}
	*/
	////////////////////////////  DEPARTEMENT \\\\\\\\\\\\\\\\\\\\\\\\\\\\\

	@Test
	public void test(){
		//Departement depar1 = new Departement("Departement 3");
		//depar.addDepartement(new Departement("Departement 3"));
		//depar.deleteDepartement(7);
		List<Departement> departements = depar.findAllDepartements();
		for (Departement departement : departements) {
			System.out.println("le nom : "+ departement.getIntituleDepartement());
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
