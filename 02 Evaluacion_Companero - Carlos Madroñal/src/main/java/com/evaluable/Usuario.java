package com.evaluable;

import java.util.Scanner;

//Definición de la clase usuario que implementa la interfaz persona
public class Usuario implements Persona{
	//Atributos
	private String nombre;
	private String fecha_nacimiento;
	private String DNI;
	public static Scanner scanner = new Scanner(System.in);

	// Constructores que utilizan los métodos set
	public Usuario() {
		setNombre("");
		setFecha_nacimiento("");
		setDNI("");
		
	}
	
	public Usuario(String nombre, String fecha_nacimiento, String DNI) {
		setNombre(nombre);
		setFecha_nacimiento(fecha_nacimiento);
		setDNI(DNI);
		
	}
	
	//Metodos get y set
	public String getNombre() {
		return nombre;
	}

	//Metodos get y set
	// Depuramos llamando a la clase creada "Depurar".
	public void setNombre(String nombre) {
		nombre=Depurar.solicitarTexto(scanner, "Escriba su nombre: "); // Depuramos llamando a la clase creada.
		this.nombre = nombre;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		fecha_nacimiento=Depurar.solicitarFecha(scanner, "Escriba su fecha de nacimiento (dd/mm/aaaa): ");
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getDNI() {
		return DNI;
	}

	public boolean setDNI(String dNI) {
		dNI=Depurar.solicitarDNI(scanner, "Introduzca su DNI: ");
		DNI = dNI;
		return true;
	}


	//Métodos que sobreescriben
	@Override
	public int calcularEdad() {
		int edad=2025-(Integer.parseInt(getFecha_nacimiento().substring(6, 10)));
		return edad;
	}
	@Override
	public String saludar() {
		return "Bienvenido al programa de gestión de gastos personales "+getNombre();
	}

	@Override
	public String toString() {
		return "\nNombre: " + nombre + "\nFecha de nacimiento: " + fecha_nacimiento + "\nDNI: " + DNI;
		//+ "\Edad: " + calcularEdad
	}
	

	
	
	
}
