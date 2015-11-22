package employesAvecHeritage ; 

public abstract class EmployeAvecHSup extends EmployeQuelconque {

    protected static double TEMPS_TRAVAIL = 35, TAUX_HORAIRE = 7.5;
    protected double majoration, heures ;
    
    public EmployeAvecHSup(String nom) {
	super(nom);
	majoration = 1;
	heures = 0;
    }
    public void setTravail(double heures) { this.heures = heures ; }
    
    public double salaireHebdo() {
	if (heures > TEMPS_TRAVAIL)
	    return TEMPS_TRAVAIL * TAUX_HORAIRE
		+ (heures - TEMPS_TRAVAIL) * TAUX_HORAIRE * majoration ;
	return heures * TAUX_HORAIRE;
    }
   
}
