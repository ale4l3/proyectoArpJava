package logicaNegocio;

public class ItemCarrito {

		// Atributos
	
		public int idItemCarrito;
		public double Itemtotal;
		public double Cantidad;
		
		// Metodos Atributos
		
		public int getIdItem_Carrito() {
		return idItemCarrito;
		}
		public void setIdItem_Carrito(int idItem_Carrito) {
		this.idItemCarrito = idItem_Carrito;
		}
		public double getItem_total() {
		return Itemtotal;
		}
		public void setItem_total(double item_total) {
		Itemtotal = item_total;
		
		}
		
		public double getCantidad() {
			return Cantidad;
			}
			public void setCantidad(double cantidad) {
			Cantidad = cantidad;
			}
			// Metodos
			public void Leer_Mostrar() {};
			
			public void Leer_Cargar(Producto obj, double cant) {
			this.idItemCarrito = obj.idProducto;
			this.Cantidad = cant;
			this.Itemtotal = obj.PrecioUnitario * cant;
		}
	}

