package gcom.app.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

	/*
	 + ID_Conducteur: Integer
	 + Nom_Conducteur: String
	 + Prenom_Conducteur: String
	 + Tele_Conducteur: Long
	 + Email_Conducteur: String
	 + Etat_Cond_Vehicule : boolean
	 + Adresse_Conducteur:String
	 + Date_expi_permis: Date
	 + Etat_Conducteur : Boolean
	 + Type_Conducteur : String
	 */

@SuppressWarnings("serial")
@Entity
@Table(name="CONDUCTEUR")
public class Conducteur implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_Conducteur" , unique =true , nullable=false)
	private Integer idConducteur;
	
	@Column(name="Nom_Conducteur")
	private String nomConducteur;
	

	
	@Column(name="Prenom_Conducteur")
	private String prenomConducteur;
	
	@Column(name="Tele_Conducteur")
	private String teleConducteur;
	
	@Column(name="Email_Conducteur")
	private String emailConducteur;
	
	@Column(name="Adresse_Conducteur")
	private String adresseConducteur;
	
	@Temporal(TemporalType.DATE)
	@Column(name="Date_expi_permis")
	private Date DateExpiPermis;
	
	@Column(name="Etat_Conducteur")
	private Boolean etatConducteur ;
	
	@Column(name="Etat_Cond_Vehicule")
	private boolean etatcondvehicule;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_ChefDeProjet")
	private Utilisateur chefdeprojet;
	
	@OneToMany(cascade = { javax.persistence.CascadeType.ALL }, fetch=FetchType.LAZY,mappedBy="conducteur")
	private Set<Mission> missionConducteur;
	
	@OneToMany(cascade = { javax.persistence.CascadeType.ALL }, fetch=FetchType.LAZY,mappedBy="conducteur")
	private Set<Condveh> condveh;

	

	
	public Conducteur(String nomConducteur, String prenomConducteur,
			String teleConducteur, String emailConducteur,
			String adresseConducteur, Date dateExpiPermis,
			Boolean etatConducteur , Boolean etatcondvehicule) {
		super();
		this.nomConducteur = nomConducteur;
		this.prenomConducteur = prenomConducteur;
		this.teleConducteur = teleConducteur;
		this.emailConducteur = emailConducteur;
		this.adresseConducteur = adresseConducteur;
		DateExpiPermis = dateExpiPermis;
		this.etatConducteur = false;
		this.etatcondvehicule = false;
	}

	

	
	public Conducteur() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	public boolean isEtatcondvehicule() {
		return etatcondvehicule;
	}




	public void setEtatcondvehicule(boolean etatcondvehicule) {
		this.etatcondvehicule = etatcondvehicule;
	}




	public Integer getIdConducteur() {
		return idConducteur;
	}




	public void setIdConducteur(Integer idConducteur) {
		this.idConducteur = idConducteur;
	}




	public String getNomConducteur() {
		return nomConducteur;
	}




	public void setNomConducteur(String nomConducteur) {
		this.nomConducteur = nomConducteur;
	}




	public String getPrenomConducteur() {
		return prenomConducteur;
	}




	public void setPrenomConducteur(String prenomConducteur) {
		this.prenomConducteur = prenomConducteur;
	}




	public String getTeleConducteur() {
		return teleConducteur;
	}




	public void setTeleConducteur(String teleConducteur) {
		this.teleConducteur = teleConducteur;
	}




	public String getEmailConducteur() {
		return emailConducteur;
	}




	public void setEmailConducteur(String emailConducteur) {
		this.emailConducteur = emailConducteur;
	}




	public String getAdresseConducteur() {
		return adresseConducteur;
	}




	public void setAdresseConducteur(String adresseConducteur) {
		this.adresseConducteur = adresseConducteur;
	}




	public Date getDateExpiPermis() {
		return DateExpiPermis;
	}




	public void setDateExpiPermis(Date dateExpiPermis) {
		DateExpiPermis = dateExpiPermis;
	}




	public Boolean getEtatConducteur() {
		return etatConducteur;
	}




	public void setEtatConducteur(Boolean etatConducteur) {
		this.etatConducteur = etatConducteur;
	}




	public Utilisateur getChefdeprojet() {
		return chefdeprojet;
	}




	public void setChefdeprojet(Utilisateur chefdeprojet) {
		this.chefdeprojet = chefdeprojet;
	}




	public Set<Mission> getMissionConducteur() {
		return missionConducteur;
	}




	public void setMissionConducteur(Set<Mission> missionConducteur) {
		this.missionConducteur = missionConducteur;
	}




	public Set<Condveh> getCondveh() {
		return condveh;
	}




	public void setCondveh(Set<Condveh> condveh) {
		this.condveh = condveh;
	}




	public String toString()
	{
		return "nom : " + nomConducteur + " prenom : " + prenomConducteur;
	}



	
	
	
}
