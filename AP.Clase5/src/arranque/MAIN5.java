package arranque;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import logicaNegocio.Producto;
import logicaNegocio.Carrito;
import logicaNegocio.ItemCarrito;


public class MAIN5 {
	

	public static void main(String[] args) {
		
	String ruta = "C:\\Users\\aleja\\Desktop\\PROGRAM\\proyectoArpJava\\ArchivoAP\\Clase5ListaDeItems.txt";
	System.out.println("....... Leyendo archivo y creando objetos ......\n" + "\n ......");
	ScannerClass(ruta);
	
	}
	
	public static void ScannerClass(String ruta)
	{ 

	int Id = 1;
	String DescProducto;
	Double Cantidad;
	Double Precio;
	File file = new File(ruta);
	Carrito Carrito= new Carrito(); 

	try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8))

	{
		if (sc.hasNextLine()) {
		    sc.nextLine();
		}
		
		while (sc.hasNextLine()) 
	{
	
		String[] VectorString = (sc.nextLine()).split(",");
	
		DescProducto = VectorString[2];
	
		Cantidad = Double.parseDouble(VectorString[0]);

		Precio = Double.parseDouble(VectorString[1]);
		
		Producto obj = new Producto();
		
		obj.Descripcion = DescProducto;
		obj.idProducto = Id;
		obj.PrecioUnitario=Precio;
		
		Id += 1;
		
		ItemCarrito obj2= new ItemCarrito();
		obj2.Leer_Cargar(obj, Cantidad);
		Carrito.precio(obj2);
		
		System.out.println(".... Leo objeto: Producto que se carga con una linea del Archivo ....");
		System.out.println(" Producto: "+ obj.Descripcion +"\n Precio: "+ obj.PrecioUnitario + "\n Id: " + obj.idProducto+ "\n ......");
		System.out.println("\n.... Leo primer objeto: Items que guarda los datos del objeto, cantidad y subtotal ....\n");
		System.out.println(" Items: "+ obj2.idItemCarrito + "\n Cant : " + obj2.Cantidad + "\n Desc.: " + obj.Descripcion +"\n SubTotal: "+ obj2.Itemtotal + "\n ......");
		
	}
		System.out.println(" TotalCarrito: "+ Carrito.Total);
		}
		catch (IOException e) {
		e.printStackTrace();
		}
		}
	}

