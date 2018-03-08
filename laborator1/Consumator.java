package laborator1;

import java.util.Vector;

public class Consumator extends Thread{

	private static Runnable lungimeVector;
	private Vector<Produs> coada = new Vector<Produs>();
	
	public Consumator(String nume) 
	   { 
	    super(lungimeVector);
	   }
	
    public synchronized void run() 
	   { 
	     try{ 
	            if(coada.size()>0)
	            {
	            	Produs p  = (Produs) coada.firstElement();
	            	coada.removeElement(p);
				    sleep(2000); 
				    System.out.println(p);
	             } 
	         } 
	         catch( InterruptedException e ) {}

	   }

}
