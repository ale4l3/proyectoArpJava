package logicaNegocio;

public interface Descuento {
    
	public static String nombre = "Descuento ";
	
	double aplicarDescuento(double porcentaje, double precioTotal);
    
}