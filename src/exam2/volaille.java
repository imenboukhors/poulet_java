package exam2;

public abstract class volaille {
	
	protected double poid;
	protected int id ;
	public volaille(double poid,int id) {
		
		this.poid=poid;
		this.id= id;
	}
	 public void affiche() {
			
			System .out.println( getPoid()+" "+  getId( ));
			
			}
	 double getPoid() {
		 return poid;
		
	 }
	 int getId( ) {
		 return id ;
	 }
	 
	
	 
	
}
