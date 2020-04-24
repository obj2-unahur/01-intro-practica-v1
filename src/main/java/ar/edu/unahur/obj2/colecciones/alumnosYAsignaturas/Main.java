package ar.edu.unahur.obj2.colecciones.alumnosYAsignaturas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        boolean finalizar = false;

        Scanner ingresoMenu = new Scanner(System.in);
        Scanner ingresoNombreAlumno = new Scanner(System.in);
        Scanner ingresoApellido = new Scanner(System.in);
        Scanner ingresoEmail = new Scanner(System.in);
        Scanner ingresoNombreAsignatura = new Scanner(System.in);
        Scanner ingresoHorasSemanales = new Scanner(System.in);

        while(!finalizar) {
            menu.imprimirMenu();

            int eleccion = ingresoMenu.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println("-- CREAR ALUMNO --");

                    System.out.print("Ingrese el nombre: ");
                    String nombreAlumno = ingresoNombreAlumno.nextLine();

                    System.out.print("Ingrese el apellido: ");
                    String apellido = ingresoApellido.nextLine();

                    System.out.print("Ingrese el email: ");
                    String email = ingresoEmail.nextLine();

                    menu.crearNuevoAlumno(nombreAlumno, apellido, email);

                    break;
                case 2:
                    System.out.println("-- CREAR ASIGNATURA --");

                    System.out.print("Ingrese el nombre: ");
                    String nombreAsignatura = ingresoNombreAsignatura.nextLine();

                    System.out.print("Ingrese las horas semanales: ");
                    int horasSemanales = ingresoHorasSemanales.nextInt();

                    menu.crearNuevaAsignatura(nombreAsignatura, horasSemanales);

                    break;
                case 3:
                    System.out.println("-- MATRICULAR ALUMNO EN ASIGNATURA --");

                    System.out.print("Ingrese el nombre del alumno: ");
                    String nombreAlumno2 = ingresoNombreAlumno.nextLine();

                    System.out.print("Ingrese el apellido del alumno: ");
                    String apellido2 = ingresoApellido.nextLine();

                    System.out.print("Ingrese el nombre de la asignatura: ");
                    String nombreAsignatura2 = ingresoNombreAsignatura.nextLine();

                    menu.matricularAlumno(nombreAsignatura2, nombreAlumno2, apellido2);

                    break;
                case 4:
                    System.out.println("-- LISTADO DE ALUMNOS MATRICULADOS EN UNA ASIGNATURA --");

                    System.out.print("Ingrese el nombre de la asignatura: ");
                    String nombreAsignatura3 = ingresoNombreAsignatura.nextLine();

                    menu.listarAlumnosEnAsignatura(nombreAsignatura3);

                    break;
                case 5:
                    System.out.println("-- LISTADO DE ASIGNATURAS EN LAS QUE ESTA MATRICULADO UN ALUMNO Y TOTAL DE HORAS --");

                    menu.listadoAsignaturasConAlumnos();

                    break;
                case 6:
                    finalizar = true;
                    System.out.println("GoodBye!");
                    break;
            }
        }
    }
}
