package ar.edu.unahur.obj2.clases;

public class Vendedor extends Empleado {
    private float porcentComision;
    private float totalVentas;

    public Vendedor(int dni, String nombre, String apellido, String email, float sueldoBase, float porcentComision, float totalVentas) {
        super(dni, nombre, apellido, email, sueldoBase);
        this.porcentComision = porcentComision;
        this.totalVentas = totalVentas;
    }

    @Override
    public float getSueldo(){
        return getSueldoBase() + (porcentComision * totalVentas/100);
    }

    public float getPorcentComision() {
        return porcentComision;
    }

    public float getTotalVentas() {
        return totalVentas;
    }
}
