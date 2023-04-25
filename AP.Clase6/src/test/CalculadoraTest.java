package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Calcular.Calculadora;



public class CalculadoraTest {
 
   public CalculadoraTest() {
   }
   
   @BeforeAll
   public static void setUpClass() {
   }
   
   @AfterAll
   public static void tearDownClass() {
   }
   
   @BeforeEach
   public void setUp() {
   }
   
   @AfterEach
   public void tearDown() {
   }

   
   @Test
   public void testMultiplicar() {
       Calculadora calculadora = new Calculadora();
       double resultado = calculadora.multiplicar(80, 3);
       assertEquals(240, resultado);
   }

   @Test
   public void testSumarYDividir() {
       Calculadora calculadora = new Calculadora();
       double resultado = calculadora.dividir(calculadora.sumar(150, 180), 3);
       assertEquals(110, resultado);
   }

   @Test
   public void testRestarYMultiplicar() {
       Calculadora calculadora = new Calculadora();
       double resultado = calculadora.multiplicar(calculadora.restar(90, 50), 15);
       assertEquals(600, resultado);
   }

   @Test
   public void testSumarYMultiplicar() {
       Calculadora calculadora = new Calculadora();
       double resultado = calculadora.multiplicar(calculadora.sumar(70, 40), 25);
       assertEquals(2750, resultado);
   }
      
   
}

