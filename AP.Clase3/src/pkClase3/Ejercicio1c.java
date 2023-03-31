package pkClase3;

public class Ejercicio1c {
	
	public int sumarMayorA (int array [], int n1) {
		
		int aqu = 0;
		for (int i = 0; i < array.length; i++) {
			
		 if (n1 < array [i]) {
		 	 aqu += array [i];
		 	
		 }
		}
		
		return aqu;
}
}
