package logicaNegocio;


public class DescuentoFijo implements Descuento {
    private double valorDescuento;

    public DescuentoFijo(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    @Override
    public double aplicarDescuento(Carrito carrito, double precioTotal) {
        double precioConDescuento = precioTotal - valorDescuento;
        return Math.max(0, precioConDescuento); // El precio mínimo es 0
    }
}