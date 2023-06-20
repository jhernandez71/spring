package com.example.ob_spring_ejercicio4_5_6.controller;

import com.example.ob_spring_ejercicio4_5_6.entities.Laptop;
import com.example.ob_spring_ejercicio4_5_6.repository.LaptopRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {
    private final LaptopRepository laptopRepository;
    
    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }
    
    /**
     * Devuelve todas las Laptops
     * http://localhost:8080/api/laptops
     * @return List<Laptop>
     */
    @GetMapping("/api/laptops")
    public List<Laptop> findAll() {
        return laptopRepository.findAll();
    }
    
    /**
     * Crea una Laptop
     * http://localhost:8080/api/laptops
     * @return Laptop
     */
    @PostMapping("/api/laptops")
    public ResponseEntity<Laptop> newLaptop(@RequestBody Laptop laptop) {
        return ResponseEntity.ok(laptopRepository.save(laptop));
    }
    
    
}
