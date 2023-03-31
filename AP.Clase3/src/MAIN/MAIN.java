package MAIN;

import pkClase3.Ejercicio1a;
import pkClase3.Ejercicio1b;
import pkClase3.Ejercicio1c;
import pkClase3.Ejercicio2;

import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		//******************************************* EJERCICIO 1 A ****************************************
				System.out.println("Ejercicio 1 - A");
				
				Ejercicio1a ej1 = new Ejercicio1a();
				
				Scanner palabra = new Scanner(System.in);
				System.out.println("Ingrese palabra: ");
				String word = palabra.nextLine();
				ej1.setCadenaLetras(word);
				
				System.out.println("Ingrese la letra para buscar: ");
				Scanner LetraBuscar = new Scanner(System.in);
				char letra = (LetraBuscar.nextLine()).charAt(0);
				ej1.setLetra(letra);

				
				System.out.println ("La letra " + letra + " aparece " + ej1.CuentaAparicion() + " veces");
				
				
		//******************************************* EJERCICIO 1 B *****************************************
				System.out.println("Ejercicio 1 - B");
				
				Ejercicio1b ej2 = new Ejercicio1b();
				
				Scanner scan = new Scanner(System.in); 
				System.out.println("Ingreso un numero: ");
				int n1 = scan.nextInt(); 
				scan.nextLine(); 
				
				Scanner scan2 = new Scanner(System.in); 
				System.out.println("Ingreso otro numero: ");
				int n2 = scan2.nextInt(); 
				scan2.nextLine();
				
				Scanner scan3 = new Scanner(System.in); 
				System.out.println("Ingreso ultimo numero: ");
				int n3 = scan3.nextInt(); 
				scan3.nextLine();
				
				Scanner scan4 = new Scanner(System.in); 
				System.out.println("Ingrese 0 para ordenar de forma ascendente o 1 de forma descendente:  ");
				int n4 = scan4.nextInt(); 
				scan4.nextLine();
				
				int[] array1 = null;
				
				if (n4 == 0) {
					boolean n5 = true;
				array1 = ej2.ordenar(n1, n2, n3, n5);
				} else if (n4 == 1) {
					boolean n5 = false;
				array1 = ej2.ordenar(n1, n2, n3, n5);
					
				} else {
					System.out.println("ERROR");
					System.exit(0);
				}
				
			    for (int num : array1) {
			      System.out.print(num + " ");
			    }
			    
		//*********************************** EJERCICIO 1 C *******************************************
			    
			    System.out.println("Ejercicio 1 - C");
			    
			    
			    Ejercicio1c ej3 = new Ejercicio1c();
			    
				Scanner scan5 = new Scanner(System.in); 
				System.out.println("Ingrese un numero:  ");
				int n6 = scan5.nextInt(); 
				scan5.nextLine();
			    
			    int[] array2 = new int [] {1, 8, 9, 222, 32, 500, 44};
			    
			    int sumaMayoresA = ej3.sumarMayorA(array2, n6);
			    
			    System.out.println("La suma de los numeros mayores, según un array constante, a  " + n6 + " es " +  sumaMayoresA + ". Sigue intentando con distintos numeros para descubrir los numeros del array. Todos son numeros enteeros y positivos. Suerte!");
			    
		 //*********************************** EJERCICIO 2 *******************************************
			    
			    System.out.println("Ejercicio 2");
			    
			   
			    
				Scanner palabra2 = new Scanner(System.in);
				System.out.println("Ingrese palabra: ");
				String word2 = palabra2.nextLine();
				
				Scanner scan6 = new Scanner(System.in); 
				System.out.println("Ingrese el desplazamieto de encriptado: ");
				int des = scan6.nextInt(); 
				
				Ejercicio2 ej4 = new Ejercicio2(word2, des);
				
				System.out.println("Palabra codificada: " + ej4.Codificar());
				System.out.println("La Palabra decodificada es: " + ej4.Decodificar());
			    
			    
			    palabra.close();
			    palabra2.close();
				LetraBuscar.close();
				scan.close();
				scan2.close();
				scan3.close();
				scan4.close();
				scan5.close();
				scan6.close();
			  }
				
				

			}
