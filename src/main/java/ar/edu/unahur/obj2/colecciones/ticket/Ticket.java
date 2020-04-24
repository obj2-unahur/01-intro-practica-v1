package ar.edu.unahur.obj2.colecciones.ticket;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private List<LineaTicket> lineasDelTicket;

    public Ticket() {
        this.lineasDelTicket = new ArrayList<>();
    }

    public void agregarLinea(String nombreProducto, double precioUnidad, int numeroUnidades) {
        this.lineasDelTicket.add(new LineaTicket(nombreProducto, precioUnidad, numeroUnidades));
    }

    public void listado() {
        this.lineasDelTicket
                .stream()
                .forEach(l -> System.out.println(
                        "Nombre: " + l.getNombreProducto()
                        + " Unidades vendidas: " + l.getNumeroUnidades()
                        + " Precio total: " + l.precioTotal()
                        )
                );
    }

    public double sumaTotalLineas() {
        double total = 0;
        for(LineaTicket l: this.lineasDelTicket) {
            total += l.precioTotal();
        }
        return total;
    }
}
