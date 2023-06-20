package com.example.ob_spring_ejercicio4_5_6;

import com.example.ob_spring_ejercicio4_5_6.entities.Laptop;
import com.example.ob_spring_ejercicio4_5_6.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class ObSpringEjercicio456Application {

	public static void main(String[] args) {
	 ApplicationContext context = SpringApplication.run(ObSpringEjercicio456Application.class, args);

		LaptopRepository laptopRepository = context.getBean(LaptopRepository.class);
		Laptop laptop = new Laptop(null, "Pavilion", "HP",  800.0, LocalDate.of(2023, 6, 20));
		laptopRepository.save(laptop);
	}

}
