package com.example.ob_spring_ejercicio4_5_6.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hola")
    public String holaMundo() {
        return "Hola mundo!!!";
    }
}
