package employesSansHeritage;
public class Commercial {
    private double salaireFixe , ca ;
    private String nom ;
    public Commercial(String nom) {
	salaireFixe = 300 ;
	ca = 0;
	this.nom = nom ;
    }
    public void setTravail(double ca) { this.ca = ca ; }
    public double salaireHebdo() {
	return salaireFixe + (ca/100);
    }
    public String toString() { return nom ; }
}
