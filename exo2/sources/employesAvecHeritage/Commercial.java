package employesAvecHeritage;

public class Commercial extends EmployeQuelconque {

    protected static double caTotal = 0;
    protected double salaireFixe , ca;
    
    public Commercial(String nom) {
	salaireFixe = 300 ;
	ca = 0;
        super(nom);
    }
    public void setTravail(double ca) { this.ca = ca ; }
    
    public double salaireHebdo() {
	caTotal += ca;
	return salaireFixe + (ca/100);
    }
    
}
