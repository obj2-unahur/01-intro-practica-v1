package ar.edu.unahur.obj2.colecciones.alumnosYAsignaturas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Asignatura {
    private String nombre;
    private int horasSemanales;
    private List<Alumno> alumnos;

    public Asignatura(String nombre, int horasSemanales) {
        this.nombre = nombre;
        this.horasSemanales = horasSemanales;
        this.alumnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void agregarAlumno(Alumno nombreAlumno) {
        alumnos.add(nombreAlumno);
    }

    public void listarAlumnos() {
        System.out.println("Cantidad de alumnos: " + this.alumnos.size());
        this.alumnos.stream()
                .forEach(a -> System.out.println(
                        "-Apellido: " + a.getApellido()
                        + " -Nombre: " + a.getNombre()
                        )
                );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asignatura that = (Asignatura) o;
        return horasSemanales == that.horasSemanales &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(alumnos, that.alumnos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, horasSemanales, alumnos);
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", horasSemanales=" + horasSemanales +
                ", alumnos=" + alumnos +
                '}';
    }
}
