package com.evaluable;

//Definición de la clase abstracta Dinero.
public abstract class Dinero {

	protected double dinero;
	protected String descripcion;

	// Constructores que utilizan los métodos set
	public Dinero() {
		setDinero(0);
		setDescripcion("");
	}

	public Dinero(double dinero, String descripcion) {
		setDinero(dinero);
		setDescripcion(descripcion);
	}

	// Metodos get y set
	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
