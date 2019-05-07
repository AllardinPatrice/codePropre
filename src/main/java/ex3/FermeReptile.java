package ex3;

/**
 * Classe de ferme reptile de zoo
 * 
 * @author Patrice
 *
 */
public class FermeReptile extends ZoneZoo {

	/**
	 * Constructeur
	 * 
	 * @param animaux
	 */
	public FermeReptile() {
		super();
	}

	/**
	 * Calcul de nourriture pour la ferme de reptiles
	 */
	public double calculerKgsNourritureParJour() {
		return this.animaux.size() * 10;
	}
}
