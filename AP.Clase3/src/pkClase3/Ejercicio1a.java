package pkClase3;

public class Ejercicio1a {
	
	private String CadenaLetras;
	private char letra;
	private int CantAparece;
	
	public String getCadenaLetras() {
		return CadenaLetras;
	}
	public void setCadenaLetras(String cadenaLetras) {
		CadenaLetras = cadenaLetras;
	}
	public char getLetra() {
		return letra;
	}
	public void setLetra(char letra) {
		this.letra = letra;
	}
	public int getCantAparece() {
		return CantAparece;
	}
	public void setCantAparece(int cantAparece) {
		CantAparece = cantAparece;
	};
	public int CuentaAparicion() {
	for(int i = 0; i < CadenaLetras.length(); i++) {
	char Caracter = CadenaLetras.charAt(i);
	if (Caracter == letra) {
	 CantAparece+=1;
	
	 }
	}
	 return CantAparece;
}
	
}
