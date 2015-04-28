package gcom.app.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="VEHICULE_GPS")
public class VehiculeGPS implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID_Veh_GPS;
	
	@ManyToOne
	@JoinColumn(name="ID_Vehicule")
	private Vehicule vehicule;
	
	@ManyToOne
	@JoinColumn(name="ID_GPS")
	private GPS gps;
	
	@Column(name="Date_Affec_Veh_GPS")
	@Temporal(TemporalType.TIMESTAMP)
	private Date Date_Affec_Veh_GPS;
	
	public VehiculeGPS() {
	}

	public VehiculeGPS(Vehicule vehicule, GPS gps, Date date_Affec_Veh_GPS) {
		super();
		this.vehicule = vehicule;
		this.gps = gps;
		Date_Affec_Veh_GPS = date_Affec_Veh_GPS;
	}
	
	public Integer getID_Veh_GPS() {
		return ID_Veh_GPS;
	}

	public void setID_Veh_GPS(Integer iD_Veh_GPS) {
		ID_Veh_GPS = iD_Veh_GPS;
	}
	
	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	public GPS getGps() {
		return gps;
	}

	public void setGps(GPS gps) {
		this.gps = gps;
	}

	public Date getDate_Affec_Veh_GPS() {
		return Date_Affec_Veh_GPS;
	}

	public void setDate_Affec_Veh_GPS(Date date_Affec_Veh_GPS) {
		Date_Affec_Veh_GPS = date_Affec_Veh_GPS;
	}
	
}
