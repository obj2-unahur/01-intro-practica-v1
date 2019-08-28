package ar.edu.unahur.obj2.ejercicio31;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.testng.Assert.*;

public class TicketTest {

    private Ticket ticket;

    @BeforeMethod
    public void setUp() {
        ticket = new Ticket(1, new Date());
    }

    @Test
    public void testAgregarItem() {
        Item item = new Item("Coca", 1, 100);
        ticket.agregarItem(item);

        Item item2 = new Item("Coca", 1, 100);


        assertTrue(ticket.contieneItem(item2));
    }

    @Test
    public void testRemoverItem() {
        Item item = new Item("Coca", 1, 100);
        ticket.agregarItem(item);

        Item item2 = new Item("Coca", 1, 100);
        ticket.removerItem(item2);

        assertFalse(ticket.contieneItem(item2));
    }

    @Test
    public void testContieneItem() {
    }

    @Test
    public void testBuscarPorProducto() {
        Item item = new Item("Coca Botella", 1, 100);
        Item item2 = new Item("Coca Lata", 2, 50);
        Item item3 = new Item("Fideos", 1, 80);

        ticket.agregarItem(item);
        ticket.agregarItem(item2);
        ticket.agregarItem(item3);

        List<Item> items = ticket.buscarPorProducto("Coca");

        List<Item> itemsEsperados = Arrays.asList(item,item2);

        assertEquals(items, itemsEsperados);

    }
}