package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe de zone de zoo
 * 
 * @author Patrice
 *
 */
public abstract class ZoneZoo {
	protected List<Animal> animaux;

	/**
	 * Constructeur
	 * 
	 * @param animaux
	 */
	public ZoneZoo() {
		// Création de la liste des animaux
		this.animaux = new ArrayList<Animal>();
	}

	/**
	 * Ajout d'un animal
	 * 
	 * @param animal
	 */
	public void addAnimal(Animal animal) {
		// Si non nul
		if (animal != null) {
			// Ajout d'un animal
			animaux.add(animal);
		}

	}

	/**
	 * Comptage des animaux
	 * 
	 * @return nombre d'animaux
	 */
	public int compterAnimaux() {
		return animaux.size();
	}

	/**
	 * Affichage de la liste des animaux
	 */
	public void afficherListeAnimaux() {
		// Pour chaque animal
		for (Animal animal : animaux) {
			// Affichage du nom
			System.out.println("Animal : " + animal.getNomAnimal() + " Type : " + animal.getTypeAnimal()
					+ " Comportement : " + animal.getComportement());
		}
	}

	/**
	 * Calcul de nourriture différent suivant les animaux
	 * 
	 * @return poids de nourriture
	 */
	public abstract double calculerKgsNourritureParJour();
}
