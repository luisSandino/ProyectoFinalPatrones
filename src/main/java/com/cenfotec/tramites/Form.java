package com.cenfotec.tramites;

import java.sql.Date;

public class Form {
	private String nombre;
	private String cedula;
	private int periodo;
	private Date fechaSolicitud;
	public Form(String nombre, String cedula, int periodo, Date fechaSolicitud) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.periodo = periodo;
		this.fechaSolicitud = fechaSolicitud;
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
	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	
	
	
}
