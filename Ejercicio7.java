package propuestos_pepe3;

import java.util.Scanner;

/*Programa lea la longitud de los catetos de un tri�ngulo rect�ngulo y calcule la
longitud de la hipotenusa seg�n el teorema de Pit�goras.*/
public class Ejercicio7 {
	public static boolean comprobarTernasPitagoricas(double a, double b) {
		double c = calculoHipotenusa(a, b);
		if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2))
			return true;
		else
			return false;
	}

	public static double calculoHipotenusa(double a, double b) {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		double catetoA = 0;
		double catetoB = 0;

		System.out.println("Introduzca el valor del cateto A: ");
		catetoA = lector.nextDouble();
		System.out.println("Introduzca el valor del cateto B: ");
		catetoB = lector.nextDouble();

		if (comprobarTernasPitagoricas(catetoA, catetoB) == true)
			System.out.println("La hipotenusa del tri�ngulo es: " + calculoHipotenusa(catetoA, catetoB));
		else
			System.out.println("Lo siento los valores introducidos no son catetos de un tri�ngulo rect�ngulo");

		lector.close();
	}
}
