package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Calcular.Calculadora;


/**
*
* @author diego vargas
*/
public class CalculadoraTestX {
 
   public CalculadoraTestX() {
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

   /**
    * Test of sumar method, of class Calculadora.
    */
   @Test
   public void testSumar() {
       System.out.println("sumar");
       double num_1 = 2.0;
       double num_2 = 2.0;
       Calculadora instance = new Calculadora();
       double expResult = 4.0;
       double result = instance.sumar(num_1, num_2);
       assertEquals(expResult, result, 0.0);
       // TODO review the generated test code and remove the default call to fail.
//       fail("The test case is a prototype.");
   }
}
   /**
    * Test of restar method, of class Calculadora.
    */
//   @Test
//   public void testRestar() {
//       System.out.println("restar");
//       double num_1 = 0.0;
//       double num_2 = 0.0;
//       Calculadora instance = new Calculadora();
//       double expResult = 0.0;
//       double result = instance.restar(num_1, num_2);
//       assertEquals(expResult, result, 0.0);
//       // TODO review the generated test code and remove the default call to fail.
//       fail("The test case is a prototype.");
//   }
//
//   /**
//    * Test of multiplicar method, of class Calculadora.
//    */
//   @Test
//   public void testMultiplicar() {
//       System.out.println("multiplicar");
//       double num_1 = 0.0;
//       double num_2 = 0.0;
//       Calculadora instance = new Calculadora();
//       double expResult = 0.0;
//       double result = instance.multiplicar(num_1, num_2);
//       assertEquals(expResult, result, 0.0);
//       // TODO review the generated test code and remove the default call to fail.
//       fail("The test case is a prototype.");
//   }
//
//   /**
//    * Test of dividir method, of class Calculadora.
//    */
//   @Test
//   public void testDividir() {
//       System.out.println("dividir");
//       double num_1 = 0.0;
//       double num_2 = 0.0;
//       Calculadora instance = new Calculadora();
//       double expResult = 0.0;
//       double result = instance.dividir(num_1, num_2);
//       assertEquals(expResult, result, 0.0);
//       // TODO review the generated test code and remove the default call to fail.
//       fail("The test case is a prototype.");
//   }
//    
//}
