package ar.edu.unahur.obj2.clases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpleadoTest {

    private List<Empleado> empleados;
    Empleado vendedor1;
    Empleado vendedor2;
    Empleado administrativo1;
    Empleado administrativo2;

    @BeforeMethod
    public void setUp(){
        vendedor1 = new Vendedor(
                42856997,
                "Aldo",
                "Veliz",
                "aldov@gmail.com",
                15000,
                10f,
                1000);

        vendedor2 = new Vendedor(
                42758978,
                "Roberto",
                "Gonzales",
                "robergon@gmail.com",
                14568,
                57,
                120);

        administrativo1 = new Administrativo(
                45621458,
                "Yesica",
                "Nuñes",
                "yesipay99@gmail.com",
                25000,
                140,
                1200);

        administrativo2 = new Administrativo(
                45621458,
                "Daniela",
                "Ponce",
                "daniponce99@gmail.com",
                28000,
                110,
                1220);

        empleados = new ArrayList<>(Arrays.asList(vendedor1, vendedor2, administrativo1, administrativo2));
    }

    @Test
    public void testVendedor() {
        Assert.assertEquals(vendedor1.getSueldo(), 15100f);
    }

    @Test
    public void testAdministrativo() {
        Assert.assertEquals(administrativo1.getSueldo(), 29375f);
    }

    @Test
    public void testListarEmpleados() {
        empleados.stream().forEach(e ->
                System.out.println(
                                "DNI:" + e.getDni() +
                                "/ Nombre:" + e.getNombre() +
                                "/ Apellido:" + e.getApellido() +
                                "/ Sueldo:" + e.getSueldo()
                )
        );
    }
}