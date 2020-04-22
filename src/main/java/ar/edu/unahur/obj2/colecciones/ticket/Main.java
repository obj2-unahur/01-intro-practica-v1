package ar.edu.unahur.obj2.colecciones.ticket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean finalizar = false;
        Ticket ticket = new Ticket();
        Scanner ingresoSeleccion = new Scanner(System.in);
        Scanner ingresoProducto = new Scanner(System.in);
        Scanner ingresoPrecioUnd = new Scanner(System.in);
        Scanner ingresoCantidad = new Scanner(System.in);

        while(!finalizar) {
            System.out.println("1- Agregar item");
            System.out.println("2- Salir");
            System.out.print(">>> ");
            int seleccion = ingresoSeleccion.nextInt();

            switch (seleccion) {
                case 1:
                    System.out.println("Ingrese el nombre del producto: ");
                    String nombre = ingresoProducto.nextLine();
                    System.out.println("Ingrese el precio por unidad: ");
                    double precioUnidad = ingresoPrecioUnd.nextDouble();
                    System.out.println("Ingrese la cantidad de unidades");
                    int unidades = ingresoCantidad.nextInt();

                    ticket.agregarLinea(nombre, precioUnidad, unidades);
                    break;
                case 2:
                    finalizar = true;
                    break;
            }

        }
        System.out.println("--LISTADO--");
        ticket.listado();
        System.out.println("--TOTAL--");
        System.out.println("= " + ticket.sumaTotalLineas());
    }
}
