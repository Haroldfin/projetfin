package gcom.app.entities;

import java.io.Serializable;
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



@Entity
@Table(name="UTILISATEUR")
@SuppressWarnings("serial")
public class Utilisateur implements Serializable{
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idUtilisateur ;
	
	@Column(name="Login",length=30)
	private String login;
	
	@Column(name="Mot_De_Passe",length=45)
	private String motDePasse;
	
	@Column(name="Nom_Utilisateur")
	private String nomUtilisateur;
	
	@Column(name="Prenom_Utilisateur")
	private String prenomUtilisateur;
	
	@Column(name="Tele_Utilisateur" )
	private String teleUtilisateur;
	
	@Column(name="Email_Utilisateur" , length=50 , unique = true)
	private String emailUtilisateur;
	
	@Column(name="Photo")
	private String photo;
	
	@OneToMany(cascade = { javax.persistence.CascadeType.ALL }, fetch=FetchType.LAZY,  mappedBy="chefdeprojet")
	private Set<Conducteur> conducteurs;
	
	@ManyToOne(fetch=FetchType.LAZY )
	@JoinColumn(name="ID_Departement")
	private Departement departement;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_Role")
	private Profil profil;
	
	@OneToMany(cascade = { javax.persistence.CascadeType.ALL }, fetch=FetchType.LAZY,  mappedBy="utilisateur")
	@Column(name="Id_Conducteur")
	private Set<Mission> missionUtilisateur;

	
	
	public Utilisateur(String login, String motDePasse, String nomUtilisateur,
			String prenomUtilisateur, String teleUtilisateur,
			String emailUtilisateur, String photo) {
		super();
		this.login = login;
		this.motDePasse = motDePasse;
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.teleUtilisateur = teleUtilisateur;
		this.emailUtilisateur = emailUtilisateur;
		this.photo = photo;
	}

	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Integer idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}

	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}

	public String getTeleUtilisateur() {
		return teleUtilisateur;
	}

	public void setTeleUtilisateur(String teleUtilisateur) {
		this.teleUtilisateur = teleUtilisateur;
	}

	public String getEmailUtilisateur() {
		return emailUtilisateur;
	}

	public void setEmailUtilisateur(String emailUtilisateur) {
		this.emailUtilisateur = emailUtilisateur;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	public Profil getProfil() {
		return profil;
	}

	public void setProfil(Profil profil) {
		this.profil = profil;
	}

	public Set<Mission> getMissionUtilisateur() {
		return missionUtilisateur;
	}

	public void setMissionUtilisateur(Set<Mission> missionUtilisateur) {
		this.missionUtilisateur = missionUtilisateur;
	}

	
}
