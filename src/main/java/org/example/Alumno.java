package org.example;

import java.util.List;

public class Alumno {
    private String nombre;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre, List<Materia> materiasAprobadas) {
        this.nombre = nombre;
        this.materiasAprobadas = materiasAprobadas;
    }

    public boolean evaluarCorrelativa (Materia unaCorrelativa){
        return this.materiasAprobadas.contains(unaCorrelativa);
    }
}
