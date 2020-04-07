package ar.edu.unahur.obj2.ejercicio31;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Ticket {

    private int id;
    private Date fecha;
    private List<Item> items;

    public Ticket(int id, Date fecha) {
        this.id = id;
        this.fecha = fecha;
        items = new ArrayList<>();
    }

    public void agregarItem(Item item) {
        items.add(item);
    }

    public void removerItem(Item item) {
        items.remove(item);
    }

    public boolean contieneItem(Item item) {
        return items.contains(item);
    }

    public List<Item> buscarPorProducto(String producto) {
        return items.stream()
                .filter(i -> i.getNombre().contains(producto))
                .collect(Collectors.toList());
    }


}
