package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServices userServices = (UserServices) context.getBean("userServices");
        String textoMensaje = userServices.notificationServices.imprimirSaludo();
        System.out.println(textoMensaje);
    }

}
