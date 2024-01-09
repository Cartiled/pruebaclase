package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	static Scanner teclado = new Scanner(System.in);

	public static void pedirArray() {
		
		System.out.println("Dame un numero de tamaño maximo para el array");
		int limiteArray = teclado.nextInt();
		int [] arrayNumeros = new int [limiteArray];
		for (int i = 0; i<arrayNumeros.length; i++) {
			while (i<=limiteArray) {
			
			System.out.println("Los numeros aleatorios son: " + (Math.random()*10 + 1) );
		}
			
		}
		
	}

	public static int digitoDeNumerosDelArray() {
		int ret = 0;

		System.out.println("Elige un numero entre 0 y 9");

		do {
			try {
				ret = teclado.nextInt();
			} catch (Exception e) {
				System.out.println("Error, vuelve a intentar.");
				ret = -1;
			}
		} while ((ret < 0) || (ret > 9));

		return ret;
	}

	public static void main(String[] args) {
		
		pedirArray();
		
	}

}
