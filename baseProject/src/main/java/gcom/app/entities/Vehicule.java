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

@Entity
@Table(name="VEHICULE")
@SuppressWarnings("serial")
public class Vehicule implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_Vehicule")
	private Integer idVehicule;
	
	@Column(name="Matricule" , length=45,unique=true)
	private String matricule;
	
	@Temporal(TemporalType.DATE)
	@Column(name="Date_Acquisition",length =10)
	private Date dateAcquisition;
	
	@Temporal(TemporalType.DATE)
	@Column(name="Date_Assurance")
	private Date dateAssurance;
	
	@Temporal(TemporalType.DATE)
	@Column(name="Date_Taxe")
	private Date dateTaxe;
	
	@Column(name="Etat_Vehicule_Cond")
	private boolean etatVehiculeCond = false;
	
	@Column(name="Etat_Vehicule_GPS")
	private boolean etatVehiculeGps = false;
	
	@Column(name="Etat_Disponibilite")
	private boolean disponible = true;
	
	@Column(name="Etat_Assurance")
	private boolean etatAssurance = false;
	
	@Column(name="Etat_Taxe")
	private boolean etatTaxe = false;
	
	@ManyToOne
	@JoinColumn(name="ID_Marque")
	private MarqueVehicule marque;
	
	@OneToMany(cascade = { javax.persistence.CascadeType.ALL }, fetch=FetchType.LAZY, mappedBy="vehicule")
	@Column(name="Id_Conducteur")
	private Set<Condveh> condveh;
	
		
	public Vehicule() {
		
	}

	public Vehicule(String matricule, Date dateAcquisition) {
		super();
		this.matricule = matricule;
		this.dateAcquisition = dateAcquisition;
	}

	//getters and setters
	public Integer getIdVehicule() {
		return idVehicule;
	}

	public void setIdVehicule(Integer idVehicule) {
		this.idVehicule = idVehicule;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public Date getDateAcquisition() {
		return dateAcquisition;
	}

	public void setDateAcquisition(Date dateAcquisition) {
		this.dateAcquisition = dateAcquisition;
	}

	public Date getDateAssurance() {
		return dateAssurance;
	}

	public void setDateAssurance(Date dateAssurance) {
		this.dateAssurance = dateAssurance;
	}

	public Date getDateTaxe() {
		return dateTaxe;
	}

	public void setDateTaxe(Date dateTaxe) {
		this.dateTaxe = dateTaxe;
	}

	public boolean isEtatVehiculeCond() {
		return etatVehiculeCond;
	}

	public void setEtatVehiculeCond(boolean etatVehiculeCond) {
		this.etatVehiculeCond = etatVehiculeCond;
	}

	public boolean isEtatVehiculeGps() {
		return etatVehiculeGps;
	}

	public void setEtatVehiculeGps(boolean etatVehiculeGps) {
		this.etatVehiculeGps = etatVehiculeGps;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public boolean isEtatAssurance() {
		return etatAssurance;
	}

	public void setEtatAssurance(boolean etatAssurance) {
		this.etatAssurance = etatAssurance;
	}

	public boolean isEtatTaxe() {
		return etatTaxe;
	}
	
	public void setEtatTaxe(boolean etatTaxe) {
		this.etatTaxe = etatTaxe;
	}

	public MarqueVehicule getMarque() {
		return marque;
	}

	public void setMarque(MarqueVehicule marque) {
		this.marque = marque;
	}

	public Set<Condveh> getCondveh() {
		return condveh;
	}

	public void setCondveh(Set<Condveh> condveh) {
		this.condveh = condveh;
	}

	public String toString()
	{
		return "Matricule : " + matricule + " Date d'acquisition : " + dateAcquisition;
	}
}