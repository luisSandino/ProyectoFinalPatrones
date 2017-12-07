package com.cenfotec.tramites;

import java.time.LocalDate;

public class Form {
	private String nombre;
	private String cedula;
	private int periodo;
	private LocalDate fechaSolicitud;
	public Form(String nombre, String cedula, int periodo, LocalDate fechaGestion) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.periodo = periodo;
		this.fechaSolicitud = fechaGestion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public LocalDate getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(LocalDate fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	
	
	
}
