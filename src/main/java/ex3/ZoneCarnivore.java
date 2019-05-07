package ex3;

/**
 * Classe de zone carnivore de zoo
 * 
 * @author Patrice
 *
 */
public class ZoneCarnivore extends ZoneZoo {

	/**
	 * Constructeur
	 * 
	 * @param animaux
	 */
	public ZoneCarnivore() {
		super();
	}

	/**
	 * Calcul de nourriture pour la zone carnivore
	 */
	public double calculerKgsNourritureParJour() {
		return this.animaux.size() * 10;
	}
}
