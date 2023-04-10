package Arranque;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import logicaNegocio.Producto;
import logicaNegocio.Carrito;
import logicaNegocio.ItemCarrito;
import logicaNegocio.DescuentoFijo;
import logicaNegocio.DescuentoPorcentaje;
import logicaNegocio.DescuentoPorcentajeConTope;


public class MAIN7 {
	

	public static void main(String[] args) {
		
	String ruta = "C:\\Users\\aleja\\Desktop\\PROGRAM\\proyectoArpJava\\ArchivoAP\\Clase7ListaDeItemsDescuento.txt";
	System.out.println("....... Leyendo archivo y creando objetos ......\n" + "\n ......");
	ScannerClass(ruta);
	
	}
	
	public static void ScannerClass(String ruta)
	{ 

	    int Id = 1;
	    Integer tipoDescuento;
	    String DescProducto;
	    Double Cantidad;
	    Double Precio;
	    File file = new File(ruta);
	    Carrito Carrito1 = new Carrito();
	    double precioFinalcondescuento = 0;
	    boolean sindescuento = true;

	    try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8)) {
	    	sc.nextLine();
	    	String[] descuentoValor = sc.nextLine().split(",");
	        tipoDescuento = Integer.parseInt(descuentoValor[0]);
	        double valorDescuento = Double.parseDouble(descuentoValor[1]);
	        double topeDescuento = Double.parseDouble(descuentoValor[2]);
	        System.out.println("Descuento: " + tipoDescuento);
	        sc.nextLine();
	        
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
	        }

	        
	        if (tipoDescuento == 1) {
	            DescuentoFijo descuento = new DescuentoFijo(valorDescuento);
	            precioFinalcondescuento = descuento.aplicarDescuento(Carrito1, valorDescuento);
	            sindescuento = false;
	        } else if (tipoDescuento == 2) {
	            DescuentoPorcentaje descuento = new DescuentoPorcentaje(valorDescuento);
	            precioFinalcondescuento = descuento.aplicarDescuento(Carrito1, valorDescuento);
	            sindescuento = false;
	        } else if (tipoDescuento == 3) {
	            DescuentoPorcentajeConTope descuento = new DescuentoPorcentajeConTope(valorDescuento, topeDescuento);
	            precioFinalcondescuento = descuento.aplicarDescuento(Carrito1, valorDescuento);
	            sindescuento = false;
	        } 
	        	if (sindescuento) {
	        
	        		System.out.println(" TotalCarrito: " + Carrito1.Total);
	        
	        } else {
	        	
	        	System.out.println(" TotalCarrito: " + precioFinalcondescuento);
	        }
	    }
	    catch (IOException e) {
	        e.printStackTrace();
	    }
	    
	}
}