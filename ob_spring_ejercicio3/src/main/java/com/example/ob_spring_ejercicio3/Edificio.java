package com.example.ob_spring_ejercicio3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Edificio {

    // atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;
    private Integer pisos;
    private Boolean tieneEstacionamiento;

    // constructores
    public Edificio() {
    }

    public Edificio(Long id, String name, Integer pisos, Boolean tieneEstacionamiento) {
        Id = id;
        this.name = name;
        this.pisos = pisos;
        this.tieneEstacionamiento = tieneEstacionamiento;
    }

    // getter y setter

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public Boolean getTieneEstacionamiento() {
        return tieneEstacionamiento;
    }

    public void setTieneEstacionamiento(Boolean tieneEstacionamiento) {
        this.tieneEstacionamiento = tieneEstacionamiento;
    }


    // toString
    @Override
    public String toString() {
        return "Edificio{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", pisos=" + pisos +
                ", tieneEstacionamiento=" + tieneEstacionamiento +
                '}';
    }
}
