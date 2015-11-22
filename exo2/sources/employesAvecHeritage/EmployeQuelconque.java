package employesAvecHeritage ;

public abstract class EmployeQuelconque {

    protected String nom;

    public EmployeQuelconque(String nom){
	this.nom = nom;
    }

    public abstract void setTravail(double x);

    public abstract double salaireHebdo();

    public String toString() { return nom; }

}
