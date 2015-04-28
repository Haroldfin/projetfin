package gcom.app.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="HISTORIQUE")
@SuppressWarnings("serial")

public class Historique implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_Historique")
	private Integer idHistorique;
	
	@Column(name="Vitesse")
	private int vitesse ;
	
	@Column(name="Longitude")
	private double longitude ;
	
	@Column(name="Attitude")
	private double attitude ;
	
	@Column(name="Latitude")
	private double latitude ;
	
	@Column(name="Endroit" , length = 45 )
	private String endroit;
	
	@Column(name="Etat_carburant")
	private Integer etatCarburant ;
	
	@Column(name="Etat_Vehicule")
	private boolean etatVehicule ;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="Date_Position")
	private Date datePosition ;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_Vehicule" , nullable = false)
	private Vehicule vehicule;
	
	
	public Historique() {
		
	}

	
	public Historique(int vitesse, double longitude, double attitude,double latitude, String endroit, Integer etatCarburant,
						boolean etatVehicule, Date datePosition) {
		this.vitesse = vitesse;
		this.longitude = longitude;
		this.attitude = attitude;
		this.latitude = latitude;
		this.endroit = endroit;
		this.etatCarburant = etatCarburant;
		this.etatVehicule = etatVehicule;
		this.datePosition = datePosition;
	}


	public Integer getIdHistorique() {
		return idHistorique;
	}


	public void setIdHistorique(Integer idHistorique) {
		this.idHistorique = idHistorique;
	}


	public int getVitesse() {
		return vitesse;
	}


	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}


	public double getLongitude() {
		return longitude;
	}


	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


	public double getAttitude() {
		return attitude;
	}


	public void setAttitude(double attitude) {
		this.attitude = attitude;
	}


	public double getLatitude() {
		return latitude;
	}


	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}


	public String getEndroit() {
		return endroit;
	}


	public void setEndroit(String endroit) {
		this.endroit = endroit;
	}


	public Integer getEtatCarburant() {
		return etatCarburant;
	}


	public void setEtatCarburant(Integer etatCarburant) {
		this.etatCarburant = etatCarburant;
	}


	public boolean isEtatVehicule() {
		return etatVehicule;
	}


	public void setEtatVehicule(boolean etatVehicule) {
		this.etatVehicule = etatVehicule;
	}


	public Date getDatePosition() {
		return datePosition;
	}


	public void setDatePosition(Date datePosition) {
		this.datePosition = datePosition;
	}


	public Vehicule getVehicule() {
		return vehicule;
	}


	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	
}
