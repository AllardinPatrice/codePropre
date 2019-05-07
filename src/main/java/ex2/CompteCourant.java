package ex2;

/**
 * Classe représentant un compte courant
 * 
 * @author Patrice
 *
 */
public class CompteCourant extends CompteBancaire {

	/**
	 * Constructeur d'un compte courant
	 * 
	 * @param type
	 *            indique le type de compte
	 * @param solde
	 *            du compte
	 * @param découvert
	 *            maximum
	 */
	public CompteCourant(String type, double solde, double decouvert) {
		super("CC", solde, decouvert);
	}

}
