package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Calcular.Calculadora;

class CalculadoraTest2 {

	@Test
	void testSumar() {
//		fail("Not yet implemented");
			System.out.println("sumar");
		       double num_1 = 2.0;
		       double num_2 = 2.0;
		       Calculadora instance = new Calculadora();
		       double expResult = 4.0;
		       double result = instance.sumar(num_1, num_2);
		       assertEquals(expResult, result, 0.0);
	}

}
