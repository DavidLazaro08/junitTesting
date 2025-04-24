package com.evaluable;

import java.util.Scanner;

public class Depurar {
	public static Scanner scanner = new Scanner(System.in);

	// Método para solicitar un texto no vacío
	public static String solicitarTexto(Scanner scanner, String mensaje) {
		String texto;
		do {
			System.out.print(mensaje);
			texto = scanner.nextLine().trim();
			if (texto.isEmpty()) {
				System.out.println("⚠ Error: No puede estar vacío.");
			}
		} while (texto.isEmpty());
		return texto;
	}

	// Método para solicitar un número entero positivo
	public static int solicitarNumero(Scanner scanner, String mensaje) {
		int numero;
		while (true) {
			try {
				System.out.print(mensaje);
				numero = Integer.parseInt(scanner.nextLine().trim());
				if (numero > 0) {
					return numero;
				} else {
					System.out.println("⚠ Error: Debe ser un número positivo.");
				}
			} catch (NumberFormatException e) {
				System.out.println("⚠ Error: Ingrese un número válido.");
			}
		}
	}

	// Método para solicitar un número con decimales positivo
	public static double solicitarNumerodouble(Scanner scanner, String mensaje) {
		double numero;
		while (true) {
			try {
				System.out.print(mensaje);
				numero = Double.parseDouble(scanner.nextLine().trim());
				if (numero > 0) {
					return numero;
				} else {
					System.out.println("⚠ Error: Debe ser un número positivo.");
				}
			} catch (NumberFormatException e) {
				System.out.println("⚠ Error: Ingrese un número válido.");
			}
		}
	}

	// Método para solicitar una fecha de nacimiento con restricciones de edad
	public static String solicitarFecha(Scanner scanner, String mensaje) {
		String fecha = "";
		boolean validar = false;

		do {

			System.out.print(mensaje);
			fecha = scanner.nextLine();
			if (!fecha.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(\\d{4})$")) {
				System.out.println("⚠ Error: Fecha no valida.");
			} else {
				int año = Integer.parseInt(fecha.substring(6, 10));
				if (año > 2025) {
					System.out.println("⚠ Error: Usted aún no ha nacido.");
				} else if (año < 1900) {
					System.out.println("⚠ Error: No aceptamos a fantasmas.");
				} else {
					validar = true;
				}

			}
		} while (!validar);

		return fecha;
	}

	// Método para solicitar el número y la letra del dni
	public static String solicitarDNI(Scanner scanner, String mensaje) {
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		String dni = "0";
		boolean validar = false;
		int indiceletra = -1;
		do {
			System.out.print(mensaje);
			dni = scanner.nextLine().toUpperCase();
			dni = dni.replaceAll("-", "");

			if (!dni.matches("[0-9]{8}[A-Z a-z]")) {
				System.out.println("Error: El formato no es correcto.");
			} else {
				int numerodni = Integer.parseInt(dni.substring(0, 8));
				indiceletra = numerodni % 23;
				if (letras.charAt(indiceletra) == dni.charAt(8)) {
					validar = true;
				} else {
					System.out.println("Error: Número o letra incorrecta.");
				}
			}

		} while (!validar);

		return dni;
	}
}
