package gcom.app.service;

import gcom.app.repos.CondVehRepos;

import java.util.Date;

import javax.inject.Inject;

public class CondVeh implements ICondVeh{
	
	@Inject
	CondVehRepos condveh;
	

	@Override
	public void addConducteurVehicule(Integer idveh, Integer idcond,
			Date dateAffectation) {
				
	}
		
	
}
