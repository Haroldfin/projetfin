package gcom.app.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GPS")
@SuppressWarnings("serial")
public class GPS implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_GPS")
	private Integer idGPS;
	
	@Column(name="Numero_GPS")
	private String numeroGPS;
	
	@Column(name="Marque_GPS")
	private String marqueGPS;
	
	@Column(name="Mot_de_Passe_Gps")
	private String motPassGPS;
	
	@Column(name="Etat_GPS")
	private boolean etatGps;
	
	
	public GPS(String numeroGPS, String marqueGPS, String motPassGPS,
			boolean etatGps) {
		super();
		this.numeroGPS = numeroGPS;
		this.marqueGPS = marqueGPS;
		this.motPassGPS = motPassGPS;
		this.etatGps = etatGps;
	}

	public GPS() {
	}

	public Integer getIdGPS() {
		return idGPS;
	}

	public void setIdGPS(Integer idGPS) {
		this.idGPS = idGPS;
	}

	public String getNumeroGPS() {
		return numeroGPS;
	}

	public void setNumeroGPS(String numeroGPS) {
		this.numeroGPS = numeroGPS;
	}

	public String getMarqueGPS() {
		return marqueGPS;
	}

	public void setMarqueGPS(String marqueGPS) {
		this.marqueGPS = marqueGPS;
	}

	public String getMotPassGPS() {
		return motPassGPS;
	}

	public void setMotPassGPS(String motPassGPS) {
		this.motPassGPS = motPassGPS;
	}

	public boolean isEtatGps() {
		return etatGps;
	}

	public void setEtatGps(boolean etatGps) {
		this.etatGps = etatGps;
	}

	
}
