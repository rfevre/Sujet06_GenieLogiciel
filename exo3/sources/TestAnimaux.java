public class TestAnimaux {
    public static void main (String [] arg) {
	Animal p1 = Phenix.uniqueInstance() ;
	Animal p2 = new Phenix("Albert") ;
	System.out.println(p1) ;
	System.out.println(p2) ;
	System.out.println("C’est bien le même phénix : " + (p1 == p2)) ;
    }
}
