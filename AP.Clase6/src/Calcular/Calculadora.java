package Calcular;

public class Calculadora {
	//private double numero_1;
	//private double numero_2;
	private double total_calculo;

	public double sumar(double num_1, double num_2) {
		total_calculo = 0.0;

		if ((num_1 != 0) && (num_2 != 0)) {
			total_calculo = num_1 + num_2;
		}
		return total_calculo;
	}

	public double restar(double num_1, double num_2) {
		total_calculo = 0;

		if ((num_1 != 0) && (num_2 != 0)) {
			total_calculo = num_1 - num_2;
		}
		return total_calculo;
	}

	public double multiplicar(double num_1, double num_2) {
		total_calculo = 0;

		if ((num_1 != 0) && (num_2 != 0)) {
			total_calculo = num_1 * num_2;
		}
		return total_calculo;
	}

	public double dividir(double num_1, double num_2) {
		total_calculo = 0;

		if ((num_1 != 0) && (num_2 != 0)) {
			total_calculo = num_1 / num_2;
		}
		return total_calculo;
	}
}
