package com.cenfotec.tramites;

public class Gestion {
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
		Decanatura beca = new Decanatura();
		beca.gestionarBeca(form, carrera);

	}

	public void gestionarConvalidacion(Form form, Carrera carrera) {
		Rectoria rectoria = new Rectoria();
		rectoria.gestionarConvalidacion(form, carrera);
	}

	public void gestionarMatricula(Form form, Carrera carrera) {
		Registro registro = new Registro();
		registro.gestionarMatricula(form, carrera);}
		
	
	public void mostrarGestion(String cedula, int opcion) {
		
		switch (opcion) {
		case 1:
			Decanatura beca = new Decanatura();
			beca.mostrarGestion(cedula);
			break;
		case 2:
			Rectoria conv = new Rectoria();
			conv.mostrarGestion(cedula);
			break;
		case 3:
			Registro matricula = new Registro();
			matricula.mostrarGestion(cedula);
			break;
		case 4:
			Cobro cobros = new Cobro();
			cobros.mostrarGestion(cedula);
			break;

		default:
			System.out.println("Gestión inválida");
			break;
		}
		
		
		
	}

}
