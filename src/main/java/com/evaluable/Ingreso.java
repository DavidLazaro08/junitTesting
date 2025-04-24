package com.evaluable;

import com.evaluable.Dinero;

//Definición de la clase ingresos, hereda de la clase abstracta dinero.
public class Ingreso extends Dinero {

	public Ingreso(double ingreso, String descipcion) {
		super(ingreso, descipcion);
	}

	@Override
	public String toString() {
		return "Dinero ingresado: " + dinero + "\nDescripcion del ingreso: " + descripcion;
	}

}
