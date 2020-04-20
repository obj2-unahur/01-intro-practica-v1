package ar.edu.unahur.obj2.colecciones.empresasYEmpleados;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Menu {
    private List<Empresa> listaEmpresas;

    public Menu() {
        this.listaEmpresas = new ArrayList<>();
    }

    public void crearNuevaEmpresa(String nombre, String anioFundacion) {
        listaEmpresas.add(new Empresa(nombre, anioFundacion, new ArrayList<>()));
    }

    public void agregarEmpleado(String nombreEmpresa, String nombreEmpleado, String apellido, String fechaNacimiento, String fechaContrato) {
        Empresa empresa = buscarEmpresaEnLista(nombreEmpresa);

        empresa.agregarEmpleado(nombreEmpleado, apellido, fechaNacimiento, fechaContrato);
    }

    public void listarEmpresas() {
        listaEmpresas.stream().forEach(e -> System.out.println(e.getNombre()));
    }

    public void listadoDetalladoDeEmpresasYEmpleados() {
        for(int i=0; i<listaEmpresas.size(); i++) {
            Empresa empresa = listaEmpresas.get(i);
            System.out.println("- Nombre de la empresa: " + empresa.getNombre());
            System.out.println("- Año de fundacion: " + empresa.getAnioFundacion());
            System.out.println("- Empleados: ");
            empresa.listarEmpleados();
        }
    }

    public void imprimirMenu() {
        System.out.println("Bienvenido!");
        System.out.println("Que desea realizar?:");
        System.out.println("1- Crear una nueva empresa.");
        System.out.println("2- Añadir empleado a empresa ya existente.");
        System.out.println("3- Listado de empresas.");
        System.out.println("4- Listado detallado de empresas y empleados.");
        System.out.println("5- Salir.");
        System.out.print(">>> ");
    }

    private Empresa buscarEmpresaEnLista(String nombreEmpresa) {
        List<Empresa> empresa = listaEmpresas.stream()
                .filter(e -> e.getNombre().equals(nombreEmpresa))
                .collect(Collectors.toList());
        return empresa.get(0);
    }
}
