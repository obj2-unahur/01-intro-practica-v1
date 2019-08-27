package ar.edu.unahur.obj2.parte2.ejercicio1;

public class Estudiante extends Persona {


    public Estudiante(int edad, String nombre) {
        super(edad, nombre);
    }

    public void modificarNombre(String nombreNuevo) {
        nombre = nombreNuevo;
    }
}
