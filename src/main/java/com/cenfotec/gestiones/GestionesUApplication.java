package com.cenfotec.gestiones;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.Banner;





@SpringBootApplication
public class GestionesUApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication  app = new SpringApplication(GestionesUApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
