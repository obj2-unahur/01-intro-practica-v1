package ar.edu.unahur.obj2.ejercicio21;

public class Administrativo extends Empleado {

    private int horasExtras;
    private int horasMes;

    public Administrativo(String dni, String nombre, String apellido, String email, float sueldoBase, String legajo, int horasExtras, int horasMes) {
        super(dni, nombre, apellido, email, sueldoBase, legajo);
        this.horasExtras = horasExtras;
        this.horasMes = horasMes;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public int getHorasMes() {
        return horasMes;
    }

    @Override
    public float getSueldo() {
        return getSueldoBase() * (horasExtras*1.5f + horasMes)/horasMes;
    }
}
