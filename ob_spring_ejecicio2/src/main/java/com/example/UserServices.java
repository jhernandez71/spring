package com.example;

import org.springframework.stereotype.Component;

@Component
public class UserServices {
    NotificationServices notificationServices;

    public UserServices (NotificationServices notificationServices){
        System.out.println("Evidencia de ejecucion de Constructor de UserServices");
        this.notificationServices = notificationServices;
    }
}
