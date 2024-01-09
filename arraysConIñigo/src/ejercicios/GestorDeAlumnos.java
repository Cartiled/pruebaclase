package ejercicios;

import java.util.Scanner;

public class GestorDeAlumnos {

	static Scanner teclado = new Scanner(System.in);

	static String[] arrayAlumnos = new String[20];

	private static void mostrarUnAlumno() {
		for (int i = 0; i < arrayAlumnos.length; i++) {

			String alumno = arrayAlumnos[i];
		}
	}

	private static void mostrarAlumnos() {
		for (int i = 0; i < arrayAlumnos.length; i++) {
			String alumno = arrayAlumnos[i];
			System.out.println("Alumno [" + i + "]" + alumno);
		}
	}

	private static void aniadirAlumno() {
		String datosAlumno = pedirAlumno();
		guardarNuevoAlumno(datosAlumno);

	}

	private static void guardarNuevoAlumno(String datosAlumno) {
		for (int i = 0; i < arrayAlumnos.length; i++) {
			if (null == arrayAlumnos[i]) {
				arrayAlumnos[i] = datosAlumno;
				break;
			}

			if (i == 19) {
				System.out.println("No tenemos espacio...");
			}
		}
	}

	private static String pedirAlumno() {

		String ret = null;

		System.out.print("Dame un nombre: ");
		String nombre = teclado.next();

		System.out.print("Dame un apellido: ");
		String apellido = teclado.next();

		System.out.print("Dame un apellido2: ");
		String apellido2 = teclado.next();

		System.out.print("Dame una fecha nacimiento: ");
		String fecha = teclado.next();

		System.out.print("Dame un curso: ");
		String curso = teclado.next();

		System.out.print("Dame una clase: ");
		String clase = teclado.next();

		ret = nombre + ", " + apellido + ", " + apellido2 + ", " + fecha + ", " + curso + ", " + clase;

		return ret;

	}

	private static void pintarMenu() {
		System.out.println(" ");
		System.out.println("- Menu Inicial -");
		System.out.println("----------------");
		System.out.println("1. Aniadir alumno");
		System.out.println("2. Mostrar todos alumnos");
		System.out.println("3. Mostrar alumno");
		System.out.println("0. Salir");
		System.out.println(" ");

		System.out.println("Elige una opcion:");
	}

	private static int elegirOpcion() {
		int ret = 0;

		do {
			try {
				pintarMenu();
				ret = teclado.nextInt();
			} catch (Exception e) {
				System.out.println("Error, vuelve a intentar.");
				ret = -1;
			}
		} while ((ret < 0) || (ret > 3));

		return ret;
	}

	public static void main(String[] args) {

		int opcionMenu = 0;

		do {

			opcionMenu = elegirOpcion();

			switch (opcionMenu) {
			case 0:
				System.out.println("Adios !!!");
				break;
			case 1:
				aniadirAlumno();
				break;
			case 2:
				mostrarAlumnos();
				break;
			case 3:
				System.out.println("Esta opcion no deberia salir");
				break;
			default:
				System.out.println("Esta opcion no deberia salir");
			}

		} while (opcionMenu != 0);
		teclado.close();

	}

}
