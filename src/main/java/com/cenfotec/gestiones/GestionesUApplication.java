package com.cenfotec.gestiones;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cenfotec.tramites.Carrera;
import com.cenfotec.tramites.Form;
import com.cenfotec.tramites.Gestion;

import org.springframework.boot.Banner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@SpringBootApplication
public class GestionesUApplication implements CommandLineRunner {
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(GestionesUApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		
			
		Gestion gestion = new Gestion();
        
        while(true) {
            executeAction(gestion);
        }
			
			

	}
	
	public void menu() {
		System.out.println("********ESCOGER OPCIÓN*********");
		System.out.println("1.Solicitar Beca");
		System.out.println("2.Solicitar Convalidación");
		System.out.println("3.Solicitar Matrícula");
		System.out.println("4.Listar estado de trámites ");
		System.out.println("3.Continuar con trámites");
		System.out.println("4.Mostrar tramites finalizados ");

	}

	private void executeAction(Gestion gestion) throws Exception {
		menu();
		int opcion = Integer.parseInt(in.readLine());
		switch (opcion) {
		case 1:
			gestionarBeca(gestion);
			break;
		case 2:
			gestionarConvalidacion(gestion);
			;
			break;
		case 3:
			gestionarMatricula(gestion);
			break;
		case 4:
			break;
		case 5:

			break;
		case 6:

			break;

		default:
			System.out.println("Opcion invalida!");
			break;
		}

	}

	public static void pedirInformacion() throws IOException {
		System.out.println("Ingrese el nombre del solicitante");
		String nombre = in.readLine();
		System.out.println("Ingrese la cédula del solicitante");
		String cedula = in.readLine();
		System.out.println("Ingrese el periodo del año");
		int periodo = Integer.parseInt(in.readLine());
		System.out.println("Ingrese la fecha de la solicitud (yyyy-MM-dd)");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate fechaGestion = LocalDate.parse(in.readLine(), formatter);
		Form form = new Form(nombre, cedula, periodo, fechaGestion);
		System.out.println("Ingrese el nombre de la carrera a gestionar");
		String carreraNombre = in.readLine();
		Carrera carrera = new Carrera(carreraNombre);
		Gestion gestion = new Gestion(carrera, form);
		
	}

	public static void gestionarBeca(Gestion gestion) throws IOException {
		pedirInformacion();
		gestion.gestionarBeca(gestion.getFormulario(), gestion.getCarrera());
		System.out.println("Gestión enviada a decanatura para revisión");

	}

	public void gestionarConvalidacion(Gestion gestion) throws IOException {

		pedirInformacion();
		gestion.gestionarConvalidacion(gestion.getFormulario(), gestion.getCarrera());
		System.out.println("Gestión enviada a rectoría para revisión");

	}

	public void gestionarMatricula(Gestion gestion) throws IOException {
		pedirInformacion();
		gestion.gestionarMatricula(gestion.getFormulario(), gestion.getCarrera());
		System.out.println("Gestión enviada a registro para revisión");

		
	}

}
