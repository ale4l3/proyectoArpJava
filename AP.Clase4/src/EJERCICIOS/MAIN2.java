package EJERCICIOS;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MAIN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String TipoOP = "Multi";
		String RutaArc = "C:\\Users\\aleja\\Desktop\\PROGRAM\\proyectoArpJava\\ArchivoAP\\Clase4.txt";
		LeerArchivos(RutaArc, TipoOP);
		
	}
		public static void LeerArchivos (String Path, String TipoOP) {
			
			
			int Suma = 0;
			int multi = 1; 
			
			String ArrayNum [] = new String[10];

			try

			{

			for (String linea : Files.readAllLines (Paths.get(Path)))
			
			{

				System.out.println("Los numeros en el archivo son =\n" + linea +"\n");
				ArrayNum = linea.split(" ");
				
			}

			for(int i = 0; i < ArrayNum.length; i++) 
			
			{

			if (TipoOP == "Suma") {
				
			Suma += Integer.parseInt(ArrayNum[i]);
			
			} else {
				
				multi *= Integer.parseInt(ArrayNum[i]);
				
			}
			
			}
			
			if(TipoOP == "Suma") {
				
				System.out.println("La suma de los numeros es: " + Suma);
			
			} else {
				
				System.out.println("La multiplicacion de los numeros es: " + multi);
				
			}
			
			; }
			
			 catch (IOException e) { 
				 e.printStackTrace();
			 }
			
			
			 }

		}


