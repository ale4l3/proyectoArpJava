package logicaNegocio;

public class DescuentoPorcentajeConTope implements Descuento {
    private double porcentajeDescuento;
    private double topeDescuento;

    public DescuentoPorcentajeConTope(double porcentajeDescuento, double topeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
        this.topeDescuento = topeDescuento;
    }

    @Override
    public double aplicarDescuento(Carrito carrito, double precioTotal) {
        double descuentoAplicado = precioTotal * (porcentajeDescuento);
        if (descuentoAplicado > topeDescuento) {
            descuentoAplicado = topeDescuento;
        }
        double precioConDescuento = precioTotal - descuentoAplicado;
        return precioConDescuento; 
    }
}