package ar.edu.unahur.obj2.ejercicio1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Ejercicio1Test {

    Ejercicio1 e1;

    @BeforeTest
    public void setup() {
        e1 = new Ejercicio1();
    }

    @Test
    public void testMain() {
        int[] retorno =  e1.ordenar(new int[] {9, 7, 8, 1, 2, 6, 4, 3, 5});
        assertEquals(retorno,  new int[] {1, 2,  3, 4, 5, 6, 7, 8, 9});
    }



}