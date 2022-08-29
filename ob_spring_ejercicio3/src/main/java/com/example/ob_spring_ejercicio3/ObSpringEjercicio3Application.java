package com.example.ob_spring_ejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringEjercicio3Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ObSpringEjercicio3Application.class, args);
		EdificioRepository repository = context.getBean(EdificioRepository.class);
		System.out.println("/-------------------------------------/");
		System.out.println("Cantidad de registros actuales: " + repository.count());
		System.out.println("/-------------------------------------/");

		// Crear registro
		Edificio building = new Edificio(null, "Burj Khalifa", 163, true);
		repository.save(building);

		// Listar todos los registros
		System.out.println("/-------------------------------------/");
		System.out.println("Listado de todos los registros: ");
		System.out.println("/-------------------------------------/");
		System.out.println(repository.findAll());
		System.out.println("/-------------------------------------/");

	}

}
