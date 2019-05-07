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
	 * Comptage des animaux
	 * 
	 * @return nombre d'animaux de la ferme de reptiles
	 */
	public int compterAnimaux() {
		return animaux.size();
	}

	/**
	 * Calcul de nourriture pour la ferme de reptiles
	 */
	public double calculerKgsNourritureParJour() {
		return this.animaux.size() * 10;
	}
}
