public class Carte {



	// attributs 

	private String valeur, symbole; // valeur : as par exemple ; symbole tr�fle par exemple

	private boolean etat; // false si la carte est cach�e, 1 si elle est d�voil�e



	// constructeurs 

	public Carte (String valeur, String symbole) {

		this.valeur=valeur;

		this.symbole=symbole;

		this.etat=false; // carte cach�e par d�faut

	}



	// getter setter



	public void setEtat(boolean etat) {

		this.etat = etat;

	}

	public boolean getEtat() {

		return etat;

	}



	public void setValeur(String valeur) {

		this.valeur=valeur;

	}

	public String getValeur() {

		return valeur;

	}



	public void setSymbole(String symbole) {

		this.symbole=symbole;

	}

	public String getSymbole() {

		return symbole;

	}

	// methodes 

	public boolean isRouge() {

		

		return (symbole == "coeur" || symbole == "carreau");



	}



	public String toString() {

		/*if (etat == true)*/

			return "[" + valeur + "|" + symbole + "]";

		/*else 

			return "X";*/

	}

}