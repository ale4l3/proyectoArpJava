package logicaNegocio;

import java.util.List;
import java.util.ArrayList;

public class Carrito {
	
	// Atributos
	private String fechaCompras;
	private int idCarritoCompras;
	private ArrayList<ItemCarrito> listaItemsCarrito;
	public double Total;
	
	// Metodos Atributos 
	
	public int getIdCarrito_Compras() {
	return idCarritoCompras;
	}
	public void setIdCarrito_Compras(int idCarrito_Compras) {
	this.idCarritoCompras = idCarrito_Compras;
	}
	public String getFecha_Compras() {
	return fechaCompras;
	}
	public void setFecha_Compras(String fecha_Compras) {
	this.fechaCompras = fecha_Compras;
	}
	public double getTotal() {
	return Total;
	}
	public void setTotal(double total) {
	Total = total;
	}
	
    public Carrito() {
    	listaItemsCarrito = new ArrayList<ItemCarrito>();
    }
	
	public List<ItemCarrito> getListItemsCarrito() {
		return  listaItemsCarrito;
	}


	
	//Metodos 
	
	public double precio(ItemCarrito obj) {
	return this.Total += obj.Itemtotal;
	
	};
}

