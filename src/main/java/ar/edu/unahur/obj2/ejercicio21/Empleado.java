package ar.edu.unahur.obj2.ejercicio21;

public abstract class Empleado {

    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    private float sueldoBase;
    private String legajo;

    public Empleado(String dni, String nombre, String apellido, String email, float sueldoBase, String legajo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.sueldoBase = sueldoBase;
        this.legajo = legajo;
    }

    public String getDni() {
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("dni='").append(dni).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", sueldoBase=").append(sueldoBase);
        sb.append(", legajo='").append(legajo).append('\'');
        return sb.toString();
    }

    public abstract float getSueldo();
}
