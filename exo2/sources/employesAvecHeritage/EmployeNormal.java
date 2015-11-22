package employesAvecHeritage ;

public class EmployeNormal extends EmployeAvecHSup{
    
    protected double majoration = 1.25;
    
    public EmployeNormal(String nom) {
        super(nom,majoration);
    }
}
