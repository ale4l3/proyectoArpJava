package logicaNegocio;

public class DescuentoPorcentajeConTope implements Descuento {
    
	private double porcentajeDescuento;
	private double topeDescuento;
    private static String nombre = "Descuento Porcentaje con tope";
    
    
    public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public double getTopeDescuento() {
		return topeDescuento;
	}

	public void setTopeDescuento(double topeDescuento) {
		this.topeDescuento = topeDescuento;
	}


    public static String getNombre() {
		return nombre;
	}


	public DescuentoPorcentajeConTope(double porcentajeDescuento, double topeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
        this.topeDescuento = topeDescuento;
    }

    public double aplicarDescuento(double porcentajeDescuento, double precioTotal) {
        double descuentoAplicado = precioTotal * porcentajeDescuento;
        
        if (descuentoAplicado > topeDescuento) {
            descuentoAplicado = topeDescuento;
            
        } 
        
        double precioConDescuento = precioTotal - descuentoAplicado;
        return precioConDescuento; 
    }
}