package logicaNegocio;


public class DescuentoPorcentaje implements Descuento {
    
	private double porcentajeDescuento;    

    public DescuentoPorcentaje(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double aplicarDescuento(Carrito carrito, double precioTotal) {
        double descuentoAplicado = precioTotal * (porcentajeDescuento / 100);
        double precioConDescuento = precioTotal - descuentoAplicado;
        return precioConDescuento; 
    }
}