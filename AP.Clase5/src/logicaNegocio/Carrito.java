package logicaNegocio;

public class Carrito {
	
	// Atributos
	
	public int idCarritoCompras;
	public String fechaCompras;
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
	
	//Metodos
	
	public double precio(ItemCarrito obj) {
	return this.Total += obj.Itemtotal;
	
	};
	}

