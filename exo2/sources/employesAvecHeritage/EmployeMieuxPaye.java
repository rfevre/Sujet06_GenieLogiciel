package employesAvecHeritage ;

public class EmployeMieuxPaye extends EmployeAvecHSup{
    
    public EmployeMieuxPaye(String nom) {
        super(nom);
	majoration = 1.40;
    }
}
