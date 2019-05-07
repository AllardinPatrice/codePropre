package ex3;

/**
 * Classe de savane afriacaine du zoo
 * 
 * @author Patrice
 *
 */
public class SavaneAfricaine extends ZoneZoo {

	/**
	 * Constructeur
	 * 
	 * @param animaux
	 */
	public SavaneAfricaine() {
		super();
	}

	/**
	 * Calcul de nourriture pour la savane africaine
	 */
	public double calculerKgsNourritureParJour() {
		return this.animaux.size() * 10;
	}
}
