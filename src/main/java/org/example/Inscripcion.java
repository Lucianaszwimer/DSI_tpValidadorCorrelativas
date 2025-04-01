package org.example;

import java.util.List;

public class Inscripcion {
    private Alumno nombre;
    private List<Materia> materiasInscribirse;

    public Inscripcion(Alumno nombre, List<Materia> materiasInscribirse) {
        this.nombre = nombre;
        this.materiasInscribirse = materiasInscribirse;
    }

    public boolean aprobada(){
        return this.materiasInscribirse.stream().allMatch(materia -> materia.puedeCursar(this.nombre));
    }
}
