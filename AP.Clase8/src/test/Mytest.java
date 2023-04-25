package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import logicaNegocio.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Mytest {
	
	Carrito Carrito1 = new Carrito();
	double precioFinalcondescuento = 0.0;
	DescuentoPorcentajeConTope descuento = new DescuentoPorcentajeConTope(0.5, 1200);
	public Mytest (){

	}
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testAplicarDescuento() {
		
		double valordescuento = 0.5;
		double precioTotal = 1500;
		double precioConDescuento = aplicarDescuento(valordescuento, precioTotal);
		double precioEsperado = 750;
		assertEquals(precioEsperado, precioConDescuento);
	}
	
	private double aplicarDescuento(double valordescuento, double precioTotal) {
		
		double descuentoAplicado = precioTotal * valordescuento;
		double precioConDescuento = precioTotal - descuentoAplicado;
		if (precioConDescuento > descuento.getTopeDescuento()) {
			precioConDescuento = descuento.getTopeDescuento();
		}
		
		return precioConDescuento;
	}
	
	@Test
	//ARGUMENTO DE ERROR SI EL TOTAL DEL CARRITO ES NEGATIVO O 0
	public void testException1 ( ) {
		if (Carrito1.Total <= 0) {
			throw new IllegalArgumentException("El carrito no tiene un precio mayor a 0, no se puede aplicar un descuento.");
		}	
	}
	
	@Test
	//ARGUMENTO DE ERROR SI EL TOTAL DEL CARRITO CON DESCUENTO ES NEGATIVO
	public void testException2 ( ) {
		precioFinalcondescuento = aplicarDescuento(0.5, Carrito1.Total);
		if (precioFinalcondescuento < 0) {
			throw new IllegalArgumentException("El descuento resulta en un monto negativo, por favor revise el valor del descuento aplicado.");
		}	
  	}
	
}
