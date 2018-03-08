package laborator1;

import java.util.Vector;

public class Producator extends Thread {

	private Vector<Produs> coada = new Vector<Produs>();
	protected static int lungimeCoada;
	
	public Producator(int lungimeCoada, String nume) 
	   { 
	     Producator.lungimeCoada = lungimeCoada;
	   }
	
	public synchronized void run() {
			try {
					Produs p = new Produs(Long.toString(Produs.next()));
					 if(coada.size()<= lungimeCoada)
					{
						coada.addElement(p);
						sleep(2000);
					}
			}
			catch (Exception e) {};
		}
}
