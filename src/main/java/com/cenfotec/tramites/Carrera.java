package com.cenfotec.tramites;

public class Carrera {
	private String nombre;
	private int creditos;
	public Carrera(String nombre, int creditos) {
		this.nombre = nombre;
		this.creditos = creditos;
	}
	
	public Carrera(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	
}
