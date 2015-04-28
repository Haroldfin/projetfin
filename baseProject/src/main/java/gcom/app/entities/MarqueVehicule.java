package gcom.app.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="MARQUE_VEHICULE")
public class MarqueVehicule implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMarque;
	@Column(name="Marque",unique = true)
	private String marque;
	
	public MarqueVehicule() {
	}

	
	public MarqueVehicule(String marque) {
		super();
		this.marque = marque;
	}


	public Integer getIdMarque() {
		return idMarque;
	}

	public void setIdMarque(Integer idMarque) {
		this.idMarque = idMarque;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

}
