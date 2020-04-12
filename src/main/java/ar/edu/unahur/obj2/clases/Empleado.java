package ar.edu.unahur.obj2.clases;

public abstract class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private String email;
    private float sueldoBase;

    public Empleado(int dni, String nombre, String apellido, String email, float sueldoBase) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.sueldoBase = sueldoBase;
    }

    public int getDni() {
        return dni;
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

    public float getSueldoBase() {
        return sueldoBase;
    }

    public abstract float getSueldo();

    @Override
    public String toString() {
        return "Empleado{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", sueldoBase=" + sueldoBase +
                '}';
    }
}
