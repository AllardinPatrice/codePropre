package ex2;

/**
 * Classe représentant un livret A
 * 
 * @author Patrice
 *
 */
public class LivretA extends CompteBancaire {
	/** Taux de rémunération du livret A */
	private Double tauxRemuneration;

	/** Constante pour les pourcentages */
	private final static int CENT = 100;

	/**
	 * Constructeur du livret A
	 * 
	 * @param solde
	 * @param tauxRemuneration
	 */
	public LivretA(double solde, double decouvert, double tauxRemuneration) {
		super("LA", solde, decouvert);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Application de rémunération annuelle
	 */
	public void appliquerRemuAnnuelle() {
		super.setSolde(super.getSolde() + super.getSolde() * tauxRemuneration / CENT);

	}

	/**
	 * Getter
	 * 
	 * @return the tauxRemuneration
	 */
	public Double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration
	 *            the tauxRemuneration to set
	 */
	public void setTauxRemuneration(Double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
