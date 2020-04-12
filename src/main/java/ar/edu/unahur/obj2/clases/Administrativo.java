package ar.edu.unahur.obj2.clases;

public class Administrativo extends Empleado {
    private float hsExtra;
    private float hsMes;

    public Administrativo(int dni, String nombre, String apellido, String email, float sueldoBase, float hsExtra, float hsMes) {
        super(dni, nombre, apellido, email, sueldoBase);
        this.hsExtra = hsExtra;
        this.hsMes = hsMes;
    }

    public float getHsExtra() {
        return hsExtra;
    }

    public float getHsMes() {
        return hsMes;
    }

    @Override
    public float getSueldo(){
        return  getSueldoBase() * ((hsExtra * 1.5f) + hsMes) / hsMes;
    }
}
