package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {
    @Test
    public void testIncripcionAprobada(){
        Materia am1 = new Materia("am1" , List.of());
        Materia algebra = new Materia("algebra" , List.of());
        Materia am2 = new Materia("am2" , List.of(am1, algebra));
        Alumno orne = new Alumno("orne" , List.of(am1, algebra));
        Inscripcion inscripcion = new Inscripcion(orne, List.of(am2));
        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void testIncripcionAprobada2(){
        Materia am1 = new Materia("am1" , List.of());
        Materia algebra = new Materia("algebra" , List.of());
        Materia am2 = new Materia("am2" , List.of(am1, algebra));
        Alumno orne = new Alumno("orne" , List.of(am1));
        Inscripcion inscripcion = new Inscripcion(orne, List.of(am2));
        Assertions.assertFalse(inscripcion.aprobada());
    }
}