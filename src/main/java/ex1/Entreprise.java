package ex1;

import java.util.Date;

/**
 * Classe d'entreprise
 * 
 * @author Patrice
 *
 */
public class Entreprise {

	/**
	 * Constructeur de la classe Entreprise
	 * 
	 * @param siret
	 * @param nom
	 * @param adresse
	 * @param dateCreation
	 */
	public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}

	/** Siret de l'entreprise */
	private int siret;
	/** Nom de l'entreprise */
	private String nom;
	/** Adresse de l'entreprise */
	private String adresse;
	/** Date de création de l'entreprise */
	private Date dateCreation;

	public static final int CAPITAL_MAX = 3000000;

	/**
	 * Getter du numéro de Siret
	 * 
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * Setter du numéro de Siret
	 * 
	 * @param siret
	 *            the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/**
	 * Getter du nom d'entreprise
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter du nom d'entreprise
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter de l'adresse de l'entreprise
	 * 
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Setter de l'adresse de l'entreprise
	 * 
	 * @param adresse
	 *            the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Getter de la date de création de l'entreprise
	 * 
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * Setter de la date de création de l'entreprise
	 * 
	 * @param dateCreation
	 *            the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

}
