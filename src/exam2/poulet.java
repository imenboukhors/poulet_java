package exam2;

public class poulet extends volaille implements Affichable {
static int prix;
	final static double poidAbtg =2;
	
	public poulet (double poid,int id,int price) {
		super(poid,id);
		prix = price;
	}
	
     public void affiche() {
		
	System .out.println( getPrixPoul() +" "+getPoidPoulet()+" "+ getIdPoulet( ));
	
	}
	
		int getPrixPoul() {
	 
		return prix;
		}
	 
	 double getPoidPoulet() {
		 return poid;
		
	 }
	 int getIdPoulet( ) {
		 return id ;
	 }
	
	 double prixVenplt(double price) {
   	  price = prix*poid;
   	  return price;
     }

}
