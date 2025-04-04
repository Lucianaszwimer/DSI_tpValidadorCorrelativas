package org.example;

import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre, List<Materia> correlativas) {
        this.nombre = nombre;
        this.correlativas = correlativas;
    }

    public boolean puedeCursar(Alumno alumno){
        return this.correlativas.stream().allMatch(alumno::evaluarCorrelativa);
    }
}
