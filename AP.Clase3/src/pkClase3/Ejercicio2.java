package pkClase3;

public class Ejercicio2 {
	
	//Bloque Atributos
	
	String Palabra;
	int Desplazamiento;
	String Codificacion;
	String DeCodificacion;
	static char abecedario[] = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	
	//Bloque Constructores
	
	public Ejercicio2 (String Pal, int Des) {
	this.Palabra = Pal;
	this.Desplazamiento = Des;
	}
	public Ejercicio2() {}
	
	//Bloque Metodos
	
	public String Codificar() {
	for(int indice = 0; indice < Palabra.length(); indice++)
	{
	
		char Caracter = Palabra.charAt(indice);
	
		for(int i = 0; i < abecedario.length; i++){
			
	
			if(Caracter == abecedario[i] && ((i + Desplazamiento) < 27)){
				
	
				Palabra=Palabra.replace(Caracter, abecedario[i + Desplazamiento]);
				this.Codificacion=Palabra;
	}
	}
	}
	
	return Codificacion;
	
	}
	public String Decodificar() {
	
		for(int indice = 0; indice < Palabra.length(); indice++){
			
	
			char Caracter = Palabra.charAt(indice);
	
			for(int i = 0; i < abecedario.length; i++){
				
	
				if(Caracter == abecedario[i] && ((i + Desplazamiento) < 27)){
		
	
					Palabra=Palabra.replace(Caracter, abecedario[i - Desplazamiento]);
	
					this.DeCodificacion=Palabra;
	
	}
	
	}
	
	}
	
	return DeCodificacion;
	
	}


}
