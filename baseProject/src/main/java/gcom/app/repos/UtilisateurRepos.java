package gcom.app.repos;

import gcom.app.entities.Conducteur;
import gcom.app.entities.Mission;
import gcom.app.entities.Utilisateur;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("UtilisateurRepos")
public interface UtilisateurRepos extends JpaRepository<Utilisateur,Integer>{

	Utilisateur findByEmailUtilisateur(String email);
	
	Utilisateur findByNomUtilisateur(String nom);
	
	List<Utilisateur> findByLogin(String login);
	
	@Query("from Utilisateur where Id_Role = :idrole")
	public List<Utilisateur> findByProfil(@Param("idrole") Integer idrole);
	
	@Query("from Utilisateur where Nom_Utilisateur = :nom or Prenom_Utilisateur = :nom")
	public Utilisateur findByNomUtilisateurOrPrenomUtilisateur(@Param("nom") String nom);
	
	
	public Utilisateur findByNomUtilisateurAndPrenomUtilisateur(String nom , String prenom);
	
	@Query("from Conducteur where ID_ChefDeProjet in ( select idUtilisateur from Utilisateur where Nom_Utilisateur= :nom )")
	public List<Conducteur> ListConducteursChefdeProjet(@Param("nom") String nom);
	
	@Query("from Utilisateur  where Id_Departement = :idDepar")
	public List<Utilisateur> findByDepartement(@Param("idDepar")  Integer idDepar);
	
	@Modifying
	@Query("update Utilisateur Set ID_Departement = :iddepar where idUtilisateur = :idu")
	public void affecterUtilisateurDepartement(@Param("iddepar") Integer iddepar, @Param("idu") Integer idUser );

	@Modifying
	@Query("update Utilisateur Set ID_Role = :idprofil where idUtilisateur = :idu")
	public void affecterUtilisateurProfil(@Param("idprofil") Integer idprofil, @Param("idu") Integer idUser );
	
	@Modifying
	@Query("update Conducteur Set ID_ChefDeProjet = :idchef where 	ID_Conducteur = :idc")
	public void addConducteurToProjectManagerRepos(@Param("idchef") Integer idchef , @Param("idc") Integer idc);
	
	
	@Query("from Mission where Id_Utilisateur = :id")
	public List<Mission> findByMissionUtilisateurId(@Param("id") Integer id);
	
	@Modifying
	@Query("delete from Mission where 	Id_Utilisateur = :id")
	public void deleteAllMissionOfUtilisateur(@Param("id") Integer id);
	
	@Query("from Conducteur where  Etat_Conducteur = 1 and  ID_ChefDeProjet = :id")
	public List<Conducteur> ListConduDispo(@Param("id") Integer id);
	
	
 
}
