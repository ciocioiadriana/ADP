package laborator1;

public class Main {

	private static Producator producator[]; 
	private static Consumator consumator[]; 
	public static void main(String[] args) 
	   { 
	        int i;
	     
	      for(i=0;i<producator.length;i++ ){ 
	       producator[ i ] = new Producator(i, "Producator. "+Integer.toString( i+1 )); 
	       producator[ i ].start(); 
	      } 
	      for( i=0; i<consumator.length; i++ ){ 
	       consumator[ i ] = new Consumator("Consumator. "+ Integer.toString( i+1 )); 
	       consumator[ i ].start(); 
	       } 
	   } 
}
