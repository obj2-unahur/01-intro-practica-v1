package ar.edu.unahur.obj2.ejercicio31;

import java.util.Objects;

public class Item {
    private String nombre;
    private float cantidad;
    private float precio;

    public Item(String nombre, float cantidad, float precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCantidad() {
        return cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Float.compare(item.getCantidad(), getCantidad()) == 0 &&
                Float.compare(item.getPrecio(), getPrecio()) == 0 &&
                Objects.equals(getNombre(), item.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getCantidad(), getPrecio());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Item{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", cantidad=").append(cantidad);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}

