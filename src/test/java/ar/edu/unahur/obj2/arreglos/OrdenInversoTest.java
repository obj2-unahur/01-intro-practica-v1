package ar.edu.unahur.obj2.arreglos;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class OrdenInversoTest {
    @Test
    public void testInvertirOrden() {
        OrdenInverso lista = new OrdenInverso();

        int[] retorno = lista.invertirOrden(new int[] {1,2,3,4,5,6,7,8,9,10});

        assertEquals(retorno, new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
    }
}

