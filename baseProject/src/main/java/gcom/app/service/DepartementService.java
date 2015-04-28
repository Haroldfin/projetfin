package gcom.app.service;

import gcom.app.entities.Departement;
import gcom.app.repos.DepartementRepos;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("departementService")
@Transactional
public class DepartementService implements IDepartementService{

	@Inject 
	DepartementRepos departement;
	
	@Override
	public void addDepartement(Departement depar) {
		departement.save(depar);
	}

	@Override
	public void deleteDepartement(Integer iddepar) {
		departement.delete(iddepar);
	}

	@Override
	public void updateDepartement(Departement depar) {
		departement.saveAndFlush(depar);
	}

	@Override
	public List<Departement> findAllDepartements() {
		return departement.findAll();
	}

}
