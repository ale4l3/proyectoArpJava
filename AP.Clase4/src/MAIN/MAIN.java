package MAIN;

import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Tomando los Ejercicios de la clase anterior
		haga un main, donde por parámetro ponga 3 números y una letra que represente ascendente o descendente y los muestre ordenados por tal criterio
		haga lo mismo, pero solicitando los parámetros de a uno por consola
		lo mismo, pero usando los parámetros si hay alguno (como en a) y haciendo (b) si no detecta ninguno. Vea si con una función puede evitar repetir código
		*/
		
		int[] numeros = new int[3];
		
		Scanner scan = new Scanner(System.in);
	    
	    for (int i = 0; i < numeros.length; i++) {
	      System.out.print("Ingrese tres numeros: ");
	      numeros[i] = scan.nextInt();
	    }
	    
	    Scanner scan2 = new Scanner(System.in);
	    System.out.println("Ingrese la letra \"a\" o \"d\" para ordenarlos de manera ascendente o descendente respectivamente: ");
	    char ing1 = scan2.next().charAt(0); 

	    if (ing1 == 'a') {
	    	
	        for (int i = 0; i < numeros.length - 1; i++) {
	        	
	          for (int x = i + 1; x < numeros.length; x++) {
	        	  
	            if (numeros[i] > numeros[x]) {
	            	
	              int reservado = numeros[i];
	              numeros[i] = numeros[x];
	              numeros[x] = reservado;
	              
	            }
	          }
	        }
	      } else if (ing1 == 'd') {
	    	  
	        for (int i = 0; i < numeros.length - 1; i++) {
	        	
	          for (int x = i + 1; x < numeros.length; x++) {
	        	  
	            if (numeros[x] < numeros[x]) {
	            	
	              int reservado = numeros[i];
	              numeros[i] = numeros[x];
	              numeros[x] = reservado;
	            }
	          }
	        }
	      }

	        System.out.println("Los numeros en orden: " + numeros[0] + ", " + numeros[1] + " y " + numeros[2]);
	      
		    scan.close();
		    scan2.close();
		    
	    }
	
}
	



