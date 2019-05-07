package ex3;

/**
 * Classe de liste des animaux du zoo
 * 
 * @author Patrice
 *
 */
public class ZooApplication {

	public static void main(String[] args) {
		// Création du zoo
		Zoo zoo = new Zoo("Thoiry");

		// Ajout des animaux
		zoo.addAnimal(new Animal("Gazelle", "MAMMIFERE", "HERBIVORE"));
		zoo.addAnimal(new Animal("Zèbre", "MAMMIFERE", "HERBIVORE"));
		zoo.addAnimal(new Animal("Lion", "MAMMIFERE", "HERBIVORE"));
		zoo.addAnimal(new Animal("Panthère", "MAMMIFERE", "CARNIVORE"));
		zoo.addAnimal(new Animal("Requin blanc", "POISSON", "HERBIVORE"));
		zoo.addAnimal(new Animal("Truite dorée", "POISSON", "HERBIVORE"));
		zoo.addAnimal(new Animal("Boa constrictor", "REPTILE", "CARNIVORE"));
		zoo.addAnimal(new Animal("Python", "REPTILE", "CARNIVORE"));

		// Affichage de la liste
		zoo.afficherListeAnimaux();
	}

}
