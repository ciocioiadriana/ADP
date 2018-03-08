package laborator1;

public class Produs {

	 private String nume;
	
	 public Produs(String nume) 
	    { 
	      this.setNume(nume); 
	    }

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	static long value = 0;
	public static long next() 
	   { 
	    return value++; 
	   } 
}
