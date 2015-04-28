package gcom.app.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name="MISSION")
public class Mission implements Serializable{
	
	/*
	 * 
	+ID_Mission : Integer
	+Description : String
	+Durée_Mission : Int
	+Date_Debut_Mission : Date
	+Date_Fin_Mission : Date
	+Endroit_Mission : String
	+Etat_Mission : boolean
	
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_Mission" , unique =true , nullable=false)
	private Integer idMission ;
	
	@Column(name="Description")
	private String description ;
	
	@Column(name="Date_Debut_Mission")
	private Date dateDebutMission;
	
	@Column(name="Date_Fin_Mission")
	private Date dateFinMission;
	
	@Column(name="Endroit_Mission")
	private String endroitMission;
	
	@Column(name="Etat_Mission")
	private Boolean etatMission;
	
	@ManyToOne(fetch=FetchType.LAZY )
	@JoinColumn(name="Id_Conducteur" )
	private Conducteur conducteur;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Id_Utilisateur" )
	private Utilisateur utilisateur;
	
	public Mission() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mission(String description, Date dateDebutMission,
			Date dateFinMission, String endroitMission, Boolean etatMission) {
		super();
		this.description = description;
		this.dateDebutMission = dateDebutMission;
		this.dateFinMission = dateFinMission;
		this.endroitMission = endroitMission;
		this.etatMission = etatMission;
	}
	public Integer getIdMission() {
		return idMission;
	}
	public void setIdMission(Integer idMission) {
		this.idMission = idMission;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateDebutMission() {
		return dateDebutMission;
	}
	public void setDateDebutMission(Date dateDebutMission) {
		this.dateDebutMission = dateDebutMission;
	}
	public Date getDateFinMission() {
		return dateFinMission;
	}
	public void setDateFinMission(Date dateFinMission) {
		this.dateFinMission = dateFinMission;
	}
	public String getEndroitMission() {
		return endroitMission;
	}
	public void setEndroitMission(String endroitMission) {
		this.endroitMission = endroitMission;
	}
	public Boolean getEtatMission() {
		return etatMission;
	}
	public void setEtatMission(Boolean etatMission) {
		this.etatMission = etatMission;
	}
	public Conducteur getConducteur() {
		return conducteur;
	}
	public void setConducteur(Conducteur conducteur) {
		this.conducteur = conducteur;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	public String toString()
	{
		return "desc : " + description + " endroit : " +  endroitMission;
	}
	public boolean afficherListMission(List<Mission> missions){
		if(missions.isEmpty()){
			System.out.println("liste vide");
			return false;
		}else{
			System.out.println("liste remplie");
		return true;
		}
	}
	
}
