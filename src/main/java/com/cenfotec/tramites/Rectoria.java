package com.cenfotec.tramites;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Rectoria {

	public Rectoria() {
		super();
	}

	public void gestionarConvalidacion(Form form, Carrera carrera) {

		File archivo;
		FileWriter escritor;
		BufferedWriter bw;
		PrintWriter wr;

		try {
			archivo = new File(form.getCedula() + ".txt");
			escritor = new FileWriter(archivo);
			bw = new BufferedWriter(escritor);
			wr = new PrintWriter(bw);
			wr.write(form.getNombre());
			wr.append(form.getCedula());
			wr.append(form.getFechaSolicitud().toString());
			wr.append(carrera.getNombre());
			wr.close();

		} catch (Exception e) {
			System.out.println("Ha sucedido un error: " + e);
		}

	}

	public void mostrarGestion(String cedula) {
		File archivo;
		FileReader fr;
		BufferedReader br;

		try {
			archivo = new File(cedula + ".txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);

			}

		} catch (Exception e) {
			System.out.println("Ha sucedido un error: " + e);
		}

	}
}
