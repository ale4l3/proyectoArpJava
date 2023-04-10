package EJERCICIO3;


public class MAIN3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  
		 Tome el ejercicio B de la clase 3 y que por parámetro se pueda elegir si es una codificación o decodificación, el valor del desplazo, y 2 archivos, uno para la entrada y otro para la salida. 
		 Que por pantalla solo indique si terminó o no correctamente, los resultados deben estar en el archivo de salida
		 * */
		String TipoOP = "Codificacion";
		int valordesplazo = 1;
		String RutaEntrada = "C:\\Users\\aleja\\Desktop\\PROGRAM\\proyectoArpJava\\ArchivoAP\\Clase4Entrada.I.txt";
		String RutaSalida = "C:\\Users\\aleja\\Desktop\\PROGRAM\\proyectoArpJava\\ArchivoAP\\Clase4Salida.O.txt";
		Desplazamiento(RutaEntrada, RutaSalida, TipoOP, valordesplazo);
		
		
	}
		public static void Desplazamiento (String Entrada, String Salida, String TipoOP, int valordesplazo) {
		
		char abecedario[] = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		if (TipoOP == "Codificacion") {
		
		for(int indice = 0; indice < Entrada.length(); indice++) {
		
			char Caracter = Entrada.charAt(indice);
		
			for(int i = 0; i < abecedario.length; i++) {
				
				if(Caracter == abecedario[i] && ((i + valordesplazo) < 27)){
		
					Salida = Salida.replace(Caracter, abecedario[i + valordesplazo]);
					}

				}
			}
		
		} else {
		
		for(int indice = 0; indice < Entrada.length(); indice++){
						
			char Caracter = Entrada.charAt(indice);
		
			for(int i = 0; i < abecedario.length; i++){
					
				if(Caracter == abecedario[i] && ((i + valordesplazo) < 27)){
			
					Salida = Salida.replace(Caracter, abecedario[i - valordesplazo]);
				}
		     }
		  }
		}
	}
		
}
