package ar.edu.unahur.obj2.ejercicio2;

import ar.edu.unahur.obj2.ejercicio1.Ejercicio1;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Ejercicio2Test {

    Ejercicio2 ejercicio2;

    @BeforeTest
    private void setup() {
        ejercicio2 = new Ejercicio2();
    }

    @Test
    public void test1() {
        int[] resultado = ejercicio2.buscarMayores(5, new int[] {3,5,9,6}) ;

        assertEquals(resultado, new int[] {9, 6});
    }

}