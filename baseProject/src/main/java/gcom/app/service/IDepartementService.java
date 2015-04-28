package gcom.app.service;

import gcom.app.entities.Departement;

import java.util.List;

public interface IDepartementService {

	public void addDepartement(Departement depar);
	public void deleteDepartement(Integer iddepar);
	public void updateDepartement(Departement depar);
	public List<Departement> findAllDepartements();
	
}
