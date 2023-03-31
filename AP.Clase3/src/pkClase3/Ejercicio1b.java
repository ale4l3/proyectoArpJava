package pkClase3;

public class Ejercicio1b {
	 
	public int[] ordenar(int n1, int n2, int n3, boolean orden) {
		
		int[] numeros = new int[] {n1, n2, n3};
		 
		for (int i = 0; i < numeros.length; i++) {
		
			for (int j = i + 1; j < numeros.length; j++) {
		 
				int tmp = 0;
		 
				if (orden) {
		 
					if (numeros[i] > numeros[j]) {
		 
						tmp = numeros[i];
		 
						numeros[i] = numeros[j];
		
						numeros[j] = tmp;
		 }
		 } else {
			 
		 if (numeros[i] < numeros[j]) {
		 
			 tmp = numeros[i];
		 
			 numeros[i] = numeros[j];
		 
			 numeros[j] = tmp;
		 }
		 }
		 }
		 }
		 
		return numeros;
		
	}
}
