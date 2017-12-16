package com.cenfotec.tramites;

import java.io.*;

public class Decanatura {
	private static boolean estaFinalzado = false;

	public Decanatura() {

	}

	public void gestionarBeca(Form form, Carrera carrera) {

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
			wr.append("\n" + form.getCedula());
			wr.append("\n" + form.getFechaSolicitud().toString());
			wr.append("\n" + carrera.getNombre());
			wr.append("\nEsta gestion está en proceso");
			wr.close();
			bw.close();

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
