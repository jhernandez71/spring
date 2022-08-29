package com.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationServices {

    public NotificationServices(){
        System.out.println("Evidencia de Creacion de Clase NotificationServices.");
    }

    public String imprimirSaludo(){
        return "Esto es un saludo desde NotificationServices";
    }

}
