package ex3;

/**
 * Classe de zoo
 * 
 * @author Patrice
 *
 */
public class Zoo {

	/** nom de l'animal */
	private String nom;
	/** zone de savane du zoo */
	private SavaneAfricaine savaneAfricaine;
	/** zone carnivore du zoo */
	private ZoneCarnivore zoneCarnivore;
	/** zone reptile du zoo */
	private FermeReptile fermeReptile;
	/** aquarium du zoo */
	private Aquarium aquarium;

	/**
	 * Constructeur du zoo
	 * 
	 * @param nom
	 */
	public Zoo(String nom) {
		this.nom = nom;
		// Création des différentes zones du zoo
		savaneAfricaine = new SavaneAfricaine();
		zoneCarnivore = new ZoneCarnivore();
		fermeReptile = new FermeReptile();
		aquarium = new Aquarium();
	}

	/**
	 * Ajout d'un animal au zoo
	 * 
	 * @param animal
	 */
	public void addAnimal(Animal animal) {
		if (animal.getTypeAnimal().equals("MAMMIFERE") && animal.getComportement().equals("CARNIVORE")) {
			zoneCarnivore.addAnimal(animal);
		} else if (animal.getTypeAnimal().equals("MAMMIFERE") && animal.getComportement().equals("HERBIVORE")) {
			savaneAfricaine.addAnimal(animal);
		} else if (animal.getTypeAnimal().equals("REPTILE")) {
			fermeReptile.addAnimal(animal);
		} else if (animal.getTypeAnimal().equals("POISSON")) {
			aquarium.addAnimal(animal);
		}
	}

	/**
	 * Affichage des animaux
	 */
	public void afficherListeAnimaux() {
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/**
	 * Comptage des animaux
	 */
	public int compterAnimaux() {
		return savaneAfricaine.compterAnimaux() + zoneCarnivore.compterAnimaux() + fermeReptile.compterAnimaux()
				+ aquarium.compterAnimaux();
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
