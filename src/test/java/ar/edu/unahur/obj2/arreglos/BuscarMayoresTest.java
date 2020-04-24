package ar.edu.unahur.obj2.arreglos;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BuscarMayoresTest {
    @Test
    public void testbuscarMayores() {
        BuscarMayores prueba1 = new BuscarMayores();

        List retorno = prueba1.buscarMayores(5,
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)));

        List<Integer> esperado = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

        Assert.assertEquals(retorno, esperado);
    }
}
