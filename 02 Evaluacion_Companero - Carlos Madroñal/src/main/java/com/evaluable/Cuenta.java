package com.evaluable;

import com.evaluable.Gasto;
import com.evaluable.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

	//Definición de la clase Cuenta
public class Cuenta {
	//Atributos
	public double saldo;
	public Usuario usuario;
	ArrayList<Gasto> gastos = new ArrayList<>();
	ArrayList<Ingreso> ingresos = new ArrayList<>();
	public static Scanner scanner = new Scanner(System.in);
	
	// Constructor que utiliza los métodos set
	public Cuenta(Usuario usuario) {
		setUsuario(usuario);
		setSaldo(0);
	}
	
	// Metodos get y set
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public ArrayList<Gasto> getGastos() {
		return gastos;
	}

	public void setGastos(ArrayList<Gasto> gastos) {
		this.gastos = gastos;
	}

	public ArrayList<Ingreso> getIngresos() {
		return ingresos;
	}

	public void setIngresos(ArrayList<Ingreso> ingresos) {
		this.ingresos = ingresos;
	}

	//Métodos para llenar el arraylist de gastos
	//Depuramos los datos solicitados llamando a la clase "Depurar"
	public void llenarGastos() {
		double gasto = Depurar.solicitarNumerodouble(scanner, usuario.getNombre()+" Introduce el gasto: ");
		String descripcion = Depurar.solicitarTexto(scanner, "Introduce la descripcion: ");
		Gasto nuevoGasto = new Gasto(gasto, descripcion);
		if (gasto > saldo) {
			System.out.println("Saldo insuficiente");
		} else {
			saldo = saldo - gasto;
			gastos.add(nuevoGasto);
			System.out.println("Su gasto ha sido de "+gasto);
		}

	}

	//Métodos para llenar el arraylist de ingresos
	//Depuramos los datos solicitados llamando a la clase "Depurar"
	public void llenarIngresos() {
		double ingreso = Depurar.solicitarNumerodouble(scanner, usuario.getNombre()+" Introduce el ingreso: ");
		String descripcion = Depurar.solicitarTexto(scanner, "Introduce la descripcion: ");
		Ingreso nuevoIngreso = new Ingreso(ingreso, descripcion);
		ingresos.add(nuevoIngreso);
		saldo = saldo + ingreso;
		System.out.println("Operación completada.");
		System.out.println("Su ingreso ha sido de "+ingreso);

	}

	//Métodos para mostrar los gastos, los ingresos y el saldo actualizado al llamarlos en el menu
	public void mostrarGastos() {
		if (gastos==null) {
			System.out.println("No existen movimientos de gastos");
		}
		
		for (Gasto gasto : gastos) {
			System.out.println(gasto);
		}
	}

	public void mostrarIngresos() {

		for (Ingreso ingreso : ingresos) {
			System.out.println(ingreso);
		}
	}
	public void mostrarSaldo() {
		System.out.println("Saldo actual: "+getSaldo()+"€");
	}
}
