package ar.edu.unahur.obj2.ejercicio21;

public class Vendedor extends Empleado {

    private float porcentaje;
    private float totalVenta;

    public Vendedor(String dni, String nombre, String apellido, String email, float sueldoBase, String legajo, float porcentaje, float totalVenta) {
        super(dni, nombre, apellido, email, sueldoBase, legajo);
        this.totalVenta = totalVenta;
        this.porcentaje = porcentaje;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public float getTotalVenta() {
        return totalVenta;
    }

    @Override
    public float getSueldo() {
        return getSueldoBase() + (porcentaje*totalVenta/100);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("porcentaje=").append(porcentaje);
        sb.append(", totalVenta=").append(totalVenta);
        sb.append(super.toString());
        return sb.toString();
    }
}
