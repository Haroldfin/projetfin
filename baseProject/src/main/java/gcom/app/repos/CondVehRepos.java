package gcom.app.repos;

import gcom.app.entities.Condveh;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("condVehRepos")
public abstract interface CondVehRepos  extends JpaRepository<Condveh,Integer>{

}
