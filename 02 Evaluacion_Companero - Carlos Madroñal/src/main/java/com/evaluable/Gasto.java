package com.evaluable;

//Definición de la clase gastos, hereda de la clase abstracta dinero.
public class Gasto extends Dinero {

	public Gasto(double gasto, String descipcion) {
		super(gasto, descipcion); // Llama a los atributos del padre
	}

	@Override
	public String toString() {
		return "Gasto realizado: " + dinero + "\nDescripcion del gasto: " + descripcion;
	}

}
