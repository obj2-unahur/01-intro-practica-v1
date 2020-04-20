package ar.edu.unahur.obj2.colecciones.alumnosYAsignaturas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Menu {
    List<Alumno> alumnos;
    List<Asignatura> asignaturas;

    public Menu() {
        this.alumnos = new ArrayList<>();
        this.asignaturas = new ArrayList<>();
    }

    public void crearNuevoAlumno(String nombre, String apellido, String email) {
        this.alumnos.add(new Alumno(nombre, apellido, email));
    }

    public void crearNuevaAsignatura(String nombre, int horasSemanales) {
        this.asignaturas.add(new Asignatura(nombre, horasSemanales));
    }

    public void matricularAlumno(String nombreAsignatura, String nombreAlumno, String apellido) {
        Asignatura asig = this.buscarAsignatura(nombreAsignatura);
        Alumno alum = this.buscarAlumno(nombreAlumno, apellido);
        alum.agregarAsignatura(asig);
        asig.agregarAlumno(alum);
    }

    public void listarAlumnosEnAsignatura(String nombreAsignatura) {
        Asignatura asig = this.buscarAsignatura(nombreAsignatura);
        asig.listarAlumnos();
    }

    public void listadoAsignaturasConAlumnos() {
        System.out.println("Cantidad de asignaturas con alumnos: " + this.filtrarAsignaturasConAlumnos().size());
        this.filtrarAsignaturasConAlumnos()
                .stream()
                .forEach(a -> System.out.println("-Nombre: "+ a.getNombre() + " -Total de horas: " + a.getHorasSemanales()));
    }

    public void imprimirMenu() {
        System.out.println("Bienvenido!");
        System.out.println("Que desea realizar?:");
        System.out.println("1- Crear nuevo alumno.");
        System.out.println("2- Crear nueva asignatura.");
        System.out.println("3- Matricular alumno en asignatura.");
        System.out.println("4- Listado de alumnos matriculados en una asignatura.");
        System.out.println("5- Listado de asignaturas en las que está matriculado un alumno y total de horas.");
        System.out.println("6- Salir.");
        System.out.print(">>> ");
    }

    private List<Asignatura> filtrarAsignaturasConAlumnos() {
        return this.asignaturas
                .stream()
                .filter(a -> a.getAlumnos().size() > 0 )
                .collect(Collectors.toList());

    }

    private Alumno buscarAlumno(String nombre, String apellido) {
        List<Alumno> alum = this.alumnos
                .stream()
                .filter(a -> a.getNombre().equals(nombre) && a.getApellido().equals(apellido))
                .collect(Collectors.toList());
        return alum.get(0);
    }

    private Asignatura buscarAsignatura(String nombre) {
        List<Asignatura> asig = this.asignaturas
                .stream()
                .filter(a -> a.getNombre().equals(nombre))
                .collect(Collectors.toList());
        return asig.get(0);
    }
}
