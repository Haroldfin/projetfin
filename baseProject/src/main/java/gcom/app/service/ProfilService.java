package gcom.app.service;

import gcom.app.entities.Profil;
import gcom.app.repos.ProfilRepos;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("profilService")
@Transactional
public class ProfilService implements IProfilService{
	@Inject
	ProfilRepos profil;

	@Override
	public List<Profil> findAllProfils() {
		return profil.findAll();
	}

	
}
