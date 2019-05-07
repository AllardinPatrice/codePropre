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
	 * Comptage des animaux de la savane
	 * 
	 * @return nombre d'animaux de la savane
	 */
	public int compterAnimaux() {
		return this.animaux.size();
	}

	/**
	 * Calcul de nourriture pour la savane africaine
	 */
	public double calculerKgsNourritureParJour() {
		return this.animaux.size() * 10;
	}
}
