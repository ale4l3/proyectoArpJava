package logicaNegocio;


public class DescuentoPorcentaje implements Descuento {
    
	private double porcentajeDescuento; 
	private static String nombre = "Descuento con Porcentaje";
	
	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		DescuentoPorcentaje.nombre = nombre;
	}

    public DescuentoPorcentaje(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double aplicarDescuento(double porcentaje, double precioTotal) {
        double descuentoAplicado = precioTotal * (porcentajeDescuento / 100);
        double precioConDescuento = precioTotal - descuentoAplicado;
        return precioConDescuento; 
    }
}