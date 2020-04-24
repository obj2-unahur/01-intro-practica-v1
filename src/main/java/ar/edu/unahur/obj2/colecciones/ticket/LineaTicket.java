package ar.edu.unahur.obj2.colecciones.ticket;

public class LineaTicket {
    private String nombreProducto;
    private double precioUnidad;
    private int numeroUnidades;

    public LineaTicket(String nombreProducto, double precioUnidad, int numeroUnidades) {
        this.nombreProducto = nombreProducto;
        this.precioUnidad = precioUnidad;
        this.numeroUnidades = numeroUnidades;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public int getNumeroUnidades() {
        return numeroUnidades;
    }

    public double precioTotal() {
        return this.precioUnidad * this.numeroUnidades;
    }
}
