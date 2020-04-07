package ar.edu.unahur.obj2.ejercicio21;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.testng.Assert.*;

public class EmpleadoTest {

    private List<Empleado> empleados;

    @BeforeTest
    public void setup() {
        empleados = new LinkedList<>();

        Empleado vendedor1 = new Vendedor("1111",
                "J", "P", "j@p",
                1000f, "1", 10.f, 1000);

        Empleado vendedor2 = new Vendedor("222",
                "P", "J", "p@j",
                2000f, "2", 20.f, 2000);

        Empleado administrativo1 = new Administrativo("333",
                "Z", "H", "z@h",
                3000f, "2", 100, 1000);

        empleados.add(vendedor1);
        empleados.add(vendedor2);
        empleados.add(administrativo1);
    }



    @Test
    public void test2() {
        for (Empleado e: empleados) {
            System.out.println(e.getSueldo());
        }

        empleados.stream().forEach( e -> System.out.println(e.getSueldo()));
    }

}