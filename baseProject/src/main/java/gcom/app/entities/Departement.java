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

@Entity
@Table(name="DEPARTEMENT")
@SuppressWarnings("serial")
public class Departement implements Serializable{

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_Departement")
	private	Integer idDepartement;
	@Column(name="Intitule_Departement")
	private String intituleDepartement;
	
	@OneToMany(cascade = { javax.persistence.CascadeType.ALL }, fetch=FetchType.LAZY,mappedBy="departement")
	private Set<Utilisateur> utilisateurs;

	public Departement(String intituleDepartement) {
		super();
		this.intituleDepartement = intituleDepartement;
	}

	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdDepartement() {
		return idDepartement;
	}

	public void setIdDepartement(Integer idDepartement) {
		this.idDepartement = idDepartement;
	}

	public String getIntituleDepartement() {
		return intituleDepartement;
	}

	public void setIntituleDepartement(String intituleDepartement) {
		this.intituleDepartement = intituleDepartement;
	}

	public Set<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(Set<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	
}
