package ar.edu.unahur.obj2.colecciones.alumnosYAsignaturas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Alumno {
    private String nombre, apellido, email;
    public List<Asignatura> asignaturas;

    public Alumno(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.asignaturas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public int totalDeHoras() {
        return asignaturas.stream().mapToInt(a -> a.getHorasSemanales()).sum();
    }

    public void agregarAsignatura(Asignatura nombreAsignatura) {
        asignaturas.add(nombreAsignatura);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) &&
                Objects.equals(apellido, alumno.apellido) &&
                Objects.equals(email, alumno.email) &&
                Objects.equals(asignaturas, alumno.asignaturas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, email, asignaturas);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", asignaturas=" + asignaturas +
                '}';
    }
}
