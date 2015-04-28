package gcom.app.repos;

import gcom.app.entities.Historique;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("Historique")
public interface  HistoriqueRepos extends JpaRepository<Historique,Integer>{

}
