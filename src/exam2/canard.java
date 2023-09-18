package exam2;

public class canard extends  volaille implements Affichable {
     static int prix;
     final static double poidAbtg = 1.5;
     public canard (double poid, int id,int price) {
    	 super(poid,id);
    	 prix=price;
     }
    
     int getPrixcanard() {
		 
			return prix;
		}
	 
	 double getPoidcanard() {
		 return poid;
		
	 }
	 int getIdcanard( ) {
		 return id ;  
	
	}
	 public void affiche() {
		 System .out.println( getPrixcanard()  +" " +getPoidcanard()+" "+ getIdcanard( ));
	 }
	
      double prixVentcnrd(double price) {
    	  price = prix*poid;
    	  return price;
      }
}
 