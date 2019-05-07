package ex3;

/**
 * Classe aquarium du zoo
 * 
 * @author Patrice
 *
 */
public class Aquarium extends ZoneZoo {

	/**
	 * Constructeur
	 * 
	 * @param animaux
	 */
	public Aquarium() {
		super();
	}

	/**
	 * Calcul de nourriture pour l'aquarium
	 */
	public double calculerKgsNourritureParJour() {
		return this.animaux.size() * 0.2;
	}
}
