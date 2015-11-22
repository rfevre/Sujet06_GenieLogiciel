package employesAvecHeritage;

public class Directeur extends Commercial {

    private static Directeur uniqueDirecteur;

    public Directeur(String nom) {
	super(nom);
	salaireFixe = 500;
    }

    public static Directeur getDirecteur() {
	if(uniqueDirecteur == null)
	    uniqueDirecteur = new Directeur("Directeur");
	return uniqueDirecteur;
    }

    public double salaireHebdo() {
	return salaireFixe + 1.4*caTotal;
    }

}
