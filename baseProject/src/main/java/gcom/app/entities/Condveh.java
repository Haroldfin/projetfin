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

@SuppressWarnings("serial")
@Entity
@Table(name="COND_VEH")
public class Condveh implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idConduidVehi; 
	@Temporal(TemporalType.DATE)
	@Column(name="Date_Affectation")
	private Date dateAffectation;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Id_Conducteur")

	private Conducteur conducteur;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Id_Vehicule")

	private Vehicule vehicule;
	
	

	public Condveh() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Condveh(Date dateAffectation, Conducteur conducteur,
			Vehicule vehicule) {
		super();
		this.dateAffectation = dateAffectation;
		this.conducteur = conducteur;
		this.vehicule = vehicule;
	}

	public Integer getIdConduidVehi() {
		return idConduidVehi;
	}

	public void setIdConduidVehi(Integer idConduidVehi) {
		this.idConduidVehi = idConduidVehi;
	}

	public Date getDateAffectation() {
		return dateAffectation;
	}

	public void setDateAffectation(Date dateAffectation) {
		this.dateAffectation = dateAffectation;
	}

	public Conducteur getConducteur() {
		return conducteur;
	}

	public void setConducteur(Conducteur conducteur) {
		this.conducteur = conducteur;
	}

	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	
	
}
