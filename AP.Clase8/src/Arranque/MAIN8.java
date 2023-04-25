package Arranque;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import logicaNegocio.*;




/*1. Modifique el ejercicio del carrito de la clase 5-7, para tener una cantidad ilimitada de
ítems. Verifique que cuando lea un archivo pueda leer items de cualquier tamaño
2. Agregue excepciones a los descuentos:
a. que no se pueda aplicar un descuento a un carrito de precio 0
b. que el resultado del descuento no de un monto negativo
c. Si ocurre alguna de esas 2 situaciones, mostrar por pantalla el error, en lugar
del resultado del carrito
3. Realice algún test para probar la funcionalidad de las 2 excepciones planteadas*/

public class MAIN8 {
	

	public static void main(String[] args) {
		
	String ruta = "C:\\Users\\aleja\\Desktop\\PROGRAM\\proyectoArpJava\\ArchivoAP\\Clase7ListaDeItemsDescuento.txt";
	System.out.println("....... Leyendo archivo y creando objetos ......\n" + "\n ......");
	ScannerClass(ruta);
	
	}
	
	public static void ScannerClass(String ruta)
	
	{ 
	    
	    //inicializacion variables del programa
	    Carrito Carrito1 = new Carrito();

	    File file = new File(ruta);	    
	    double precioFinalcondescuento = 0;
	    boolean sindescuento = true;
	    int Id = 1;
	    
	    //variables para descuento
	    Integer tipoDescuento;
	    String DescProducto;
	   
	    //variables para itemcarrito
	    Double Cantidad;
	    Double Precio;
	    
	    // Primera Linea del Archivo es el descuento, se guarda los valores del descuento
	    
	    try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8)) {
	    	
	    	sc.nextLine();
	    	
	    	String[] descuentoValor = sc.nextLine().split(",");
	        tipoDescuento = Integer.parseInt(descuentoValor[0]);
	        double valorDescuento = Double.parseDouble(descuentoValor[1]);
	        double topeDescuento = Double.parseDouble(descuentoValor[2]);
	        
	        if (tipoDescuento == 1) {
	        	System.out.println("--------------------- DESCUENTO: " + DescuentoFijo.getNombre() + " POR UN VALOR DE " + valorDescuento);
	        } else if (tipoDescuento == 2) {
	        	System.out.println("--------------------- DESCUENTO: " + DescuentoPorcentaje.getNombre() + " POR UN VALOR DE " + valorDescuento);
	        } else if (tipoDescuento == 3) {
	        	System.out.println("--------------------- DESCUENTO: " + DescuentoPorcentajeConTope.getNombre() + " POR UN VALOR DE " + valorDescuento + " Y UN TOPE DE " + topeDescuento);
	        }
	        
	        sc.nextLine();
	        
	   // Se prosigue con la carga de los productos e items del carrito
	        
	        while (sc.hasNextLine()) 
	        {
	            String[] VectorString = (sc.nextLine()).split(",");
	            DescProducto = VectorString[2];
	            Cantidad = Double.parseDouble(VectorString[0]);
	            Precio = Double.parseDouble(VectorString[1]);
	            
	            Producto obj = new Producto();
	            obj.Descripcion = DescProducto;
	            obj.idProducto = Id;
	            obj.PrecioUnitario = Precio;
	            Id += 1;
	            
	            ItemCarrito obj2 = new ItemCarrito();
	            obj2.Leer_Cargar(obj, Cantidad);
	            Carrito1.precio(obj2);
	            
	            System.out.println(".... Leo objeto: Producto que se carga con una linea del Archivo ....");
	            System.out.println(" Producto: "+ obj.Descripcion +"\n Precio: "+ obj.PrecioUnitario + "\n Id: " + obj.idProducto+ "\n ......");
	            System.out.println("\n.... Leo primer objeto: Items que guarda los datos del objeto, cantidad y subtotal ....\n");
	            System.out.println(" Items: "+ obj2.idItemCarrito + "\n Cant : " + obj2.Cantidad + "\n Desc.: " + obj.Descripcion +"\n SubTotal: "+ obj2.Itemtotal + "\n ......");
	            
	            //Agregar el item a la lista array de la clase carrito
	            Carrito1.getListItemsCarrito().add(obj2);
	            
	        }
	        	System.out.println(" PRECIO TOTAL SIN DESCUENTO: " + Carrito1.Total + "\n ......");
	        
	        if (tipoDescuento == 1) {
	            DescuentoFijo descuento = new DescuentoFijo(valorDescuento);
	            precioFinalcondescuento = descuento.aplicarDescuento(valorDescuento, Carrito1.Total);	
	            sindescuento = false;
	        } else if (tipoDescuento == 2) {
	            DescuentoPorcentaje descuento = new DescuentoPorcentaje(valorDescuento);
	            precioFinalcondescuento = descuento.aplicarDescuento(valorDescuento, Carrito1.Total);
	            sindescuento = false;
	        } else if (tipoDescuento == 3) {
	            DescuentoPorcentajeConTope descuento = new DescuentoPorcentajeConTope(valorDescuento, topeDescuento);
	            precioFinalcondescuento = descuento.aplicarDescuento(valorDescuento, Carrito1.Total);
	            sindescuento = false;
	        } 
	        
	        	//ARGUMENTO DE ERROR SI EL TOTAL DEL CARRITO ES NEGATIVO O 0
	        	if (Carrito1.Total <= 0) {
	        		
	            throw new IllegalArgumentException("El carrito no tiene un precio mayor a 0, no se puede aplicar un descuento.");
	            
	        }	else if (sindescuento) {
	        
	        		System.out.println(" TotalCarrito: " + Carrito1.Total);
	        		
	        	//ARGUMENTO DE ERROR SI EL TOTAL DEL CARRITO CON DESCUENTO ES NEGATIVO O 0		
	        } else  if (precioFinalcondescuento < 0) {
	        	
	            throw new IllegalArgumentException("El descuento resulta en un monto negativo, por favor revise el valor del descuento aplicado.");
	            
	        } else {
	        	System.out.println(" TotalCarrito: " + precioFinalcondescuento);
	        }
	    }
	    catch (IOException e) {
	        e.printStackTrace();
	    }
	    
	}
}