package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Saludo objSaludo = (Saludo) context.getBean("saludosServices");
        String texto = objSaludo.imprimirSaludo();
        System.out.println(texto);
    }
}
