package ex3;

/**
 * Classe Animal pour tous les animaux
 * 
 * @author Patrice
 *
 */
public class Animal {
	/**
	 * Constructeur d'un animal
	 * 
	 * @param nomAnimal
	 * @param typeAnimal
	 * @param comportement
	 */
	public Animal(String nomAnimal, String typeAnimal, String comportement) {
		this.nomAnimal = nomAnimal;
		this.typeAnimal = typeAnimal;
		this.comportement = comportement;
	}

	/** Nom de l'animal */
	private String nomAnimal;
	/** Type de l'animal */
	private String typeAnimal;
	/** Comportement de l'animal */
	private String comportement;

	/**
	 * Getter
	 * 
	 * @return the nomAnimal
	 */
	public String getNomAnimal() {
		return nomAnimal;
	}

	/**
	 * Setter
	 * 
	 * @param nomAnimal
	 *            the nomAnimal to set
	 */
	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}

	/**
	 * Getter
	 * 
	 * @return the typeAnimal
	 */
	public String getTypeAnimal() {
		return typeAnimal;
	}

	/**
	 * Setter
	 * 
	 * @param typeAnimal
	 *            the typeAnimal to set
	 */
	public void setTypeAnimal(String typeAnimal) {
		this.typeAnimal = typeAnimal;
	}

	/**
	 * Getter
	 * 
	 * @return the comportement
	 */
	public String getComportement() {
		return comportement;
	}

	/**
	 * Setter
	 * 
	 * @param comportement
	 *            the comportement to set
	 */
	public void setComportement(String comportement) {
		this.comportement = comportement;
	}

}
