package com.evaluable;

import com.evaluable.Cuenta;
import com.evaluable.Usuario;

import java.util.Scanner;
//Definición de la clase Menu.
//Se llamará en el main principal y ejecutara la selección de opciones del programa

public class Menu {

	public static void mostrarMenu() {
		
		// Se crea el objeto persona que sera el usuario
		Scanner leer = new Scanner(System.in);
		Usuario persona = new Usuario();
		Cuenta cuenta = new Cuenta(persona);

		System.out.println(persona.saludar());
		System.out.println(persona);
		System.out.println("Edad: " + persona.calcularEdad());

		int opcion = 0;

		do {
			System.out.println("\nSeleccione una opción:");
			System.out.println("1. Introduce un nuevo gasto");
			System.out.println("2. Introduce un nuevo ingreso");
			System.out.println("3. Mostrar los gastos");
			System.out.println("4. Mostrar ingresos");
			System.out.println("5. Mostrar saldo");
			System.out.println("0. Salir");

			opcion = leer.nextInt();
			switch (opcion) {

			case 1:
				cuenta.llenarGastos();
				break;
			case 2:
				cuenta.llenarIngresos();
				break;
			case 3:
				System.out.println("No se mostrará nada si no existe moviemiento.");
				System.out.println("Movimiento de gastos: ");
				cuenta.mostrarGastos();
				break;
			case 4:
				System.out.println("No se mostrará nada si no existe moviemiento.");
				System.out.println("Movimiento de ingresos: ");
				cuenta.mostrarIngresos();
				break;
			case 5:
				cuenta.mostrarSaldo();
				break;
			case 0:
				System.out.println("Fin del programa");
				break;
			default:
				System.out.println("Opción no válida, por favor intente nuevamente.");
				break;
			}
		} while (opcion != 0);

		leer.close();
	}
}
