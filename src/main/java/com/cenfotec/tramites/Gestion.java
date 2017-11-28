package com.cenfotec.tramites;

public abstract class Gestion{
	Carrera carrera;
	Form formulario;
	
	
	public Gestion(Carrera carrera, Form formulario) {
		super();
		this.carrera = carrera;
		this.formulario = formulario;
	}

	public String gestionarBeca() {
		return null;
	}
	
	public String gestionarConvalidacion() {
		return null;
	}
	public String gestionarMatricula() {
		return null;
	}
	
	
}
