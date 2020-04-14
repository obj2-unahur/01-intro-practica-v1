package ar.edu.unahur.obj2.colecciones.empresasYEmpleados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        boolean finalizar = false;

        Scanner ingresoSeleccion = new Scanner(System.in);
        Scanner ingresoNombreEmpresa = new Scanner(System.in);
        Scanner ingresoAnioFundacion = new Scanner(System.in);
        Scanner ingresoEmpresa = new Scanner(System.in);
        Scanner ingresoNombreEmpleado = new Scanner(System.in);
        Scanner ingresoApellido = new Scanner(System.in);
        Scanner ingresoNacimiento = new Scanner(System.in);
        Scanner ingresoFechaContrato = new Scanner(System.in);

        while(!finalizar) {
            System.out.println("Bienvenido!");
            System.out.println("Que desea realizar?:");
            System.out.println("1- Crear una nueva empresa.");
            System.out.println("2- Añadir empleado a empresa ya existente.");
            System.out.println("3- Listado de empresas.");
            System.out.println("4- Listado detallado de empresas y empleados.");
            System.out.println("5- Salir.");
            System.out.print(">>>");

            int eleccion = ingresoSeleccion.nextInt();

            switch(eleccion) {
                case 1:
                    System.out.print("Ingrese el nombre de la empresa: ");
                    String nombreEmpresa = ingresoNombreEmpresa.nextLine();

                    System.out.print("Ingrese el año de fundacion de la empresa: ");
                    String anioFundacion = ingresoAnioFundacion.nextLine();

                    menu.crearNuevaEmpresa(nombreEmpresa, anioFundacion);
                    break;
                case 2:
                    System.out.println("Agregar empleado:");

                    System.out.println("Ingrese el nombre de la empresa donde desea agregarlo: ");
                    String empresa = ingresoEmpresa.nextLine();

                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombreEmpleado = ingresoNombreEmpleado.nextLine();

                    System.out.print("Ingrese el apellido: ");
                    String apellidoEmpleado = ingresoApellido.nextLine();

                    System.out.print("Ingrese el año de nacimiento: ");
                    String anioDeNacimiento = ingresoNacimiento.nextLine();

                    System.out.print("Ingrese la fecha de contratacion: ");
                    String fechaContratacion = ingresoFechaContrato.nextLine();

                    menu.agregarEmpleado(empresa, nombreEmpleado, apellidoEmpleado, anioDeNacimiento, fechaContratacion);
                    break;
                case 3:
                    System.out.println("--Listado de empresas registradas-- ");
                    menu.listarEmpresas();
                    break;
                case 4:
                    System.out.println("--Listado detallado de empresas y empleados--");
                    menu.listadoDetalladoDeEmpresasYEmpleados();
                    break;
                case 5:
                    finalizar = true;
                    System.out.println("GoodBye!");
                    break;
            }
        }
    }
}
