package employesAvecHeritage ;

public class EmployeMieuxPaye extends EmployeAvecHSup{
    
    private double majoration = 1.40;
    
    public EmployeMieuxPaye(String nom) {
        super(nom,majoration);
    }
}
