package ar.edu.unahur.obj2.arreglos;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContadorLetrasTest {
    @Test
    public void testName() {
        ContadorLetras contador1 = new ContadorLetras("elefante");

        contador1.contarLetras();
        List<Integer> esperado = new ArrayList<>(Arrays.asList(3,1,3,1,1,1,1,3));

        Assert.assertEquals(contador1.visualizarRecuento(), esperado);
    }
}
