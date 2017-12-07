package com.cenfotec.tramites;

public  class Gestion{
	Carrera carrera;
	Form formulario;
	
	
	public Gestion(Carrera carrera, Form formulario) {
		super();
		this.carrera = carrera;
		this.formulario = formulario;
	}
	
	public Gestion() {
		
	}

	public Carrera getCarrera() {
		return carrera;
	}



	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}



	public Form getFormulario() {
		return formulario;
	}



	public void setFormulario(Form formulario) {
		this.formulario = formulario;
	}



	public void gestionarBeca(Form form, Carrera carrera) {
		Registro becaRegistro = new Registro();
		becaRegistro.gestionarBeca(form, carrera);
		
		
		
	}
	
	public String gestionarConvalidacion(Form form, Carrera carrera) {
		return null;
	}
	public String gestionarMatricula(Form form, Carrera carrera) {
		return null;
	}
	
	
}
