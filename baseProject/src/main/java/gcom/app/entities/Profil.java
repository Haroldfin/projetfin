package gcom.app.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name="PROFIL")
public class Profil implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_Profil" , unique =true , nullable=false)
	private Integer idProfil;
	@Column(name="Nom_Profil")
	private String nomProfil;
	@OneToMany(cascade = { javax.persistence.CascadeType.ALL },fetch=FetchType.LAZY,mappedBy="profil")
	private Set<Utilisateur> utilisateurs;
	
	public Profil(String nomProfil) {
		super();
		this.nomProfil = nomProfil;
	}
	public Profil() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getIdProfil() {
		return idProfil;
	}
	public void setIdProfil(Integer idProfil) {
		this.idProfil = idProfil;
	}
	public String getNomProfil() {
		return nomProfil;
	}
	public void setNomProfil(String nomProfil) {
		this.nomProfil = nomProfil;
	}
	public Set<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}
	public void setUtilisateurs(Set<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	
	
}
