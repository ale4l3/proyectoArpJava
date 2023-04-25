package logicaNegocio;


public class DescuentoFijo implements Descuento {
    //atributos
	private double valorDescuento;
	private static String nombre = "Descuento Fijo";

    public double getValorDescuento() {
		return valorDescuento;
	}

	public void setValorDescuento(double valorDescuento) {
		this.valorDescuento = valorDescuento;
	}

	public static String getNombre() {
		return nombre;
	}
	
	//Constructores
    public DescuentoFijo(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    //Metodos
    
    @Override
    public double aplicarDescuento(double porcentaje, double precioTotal) {
        double precioConDescuento = precioTotal - valorDescuento;
        return Math.max(0, precioConDescuento); // El precio mínimo es 0
    }


}