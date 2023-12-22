package pruebaTecnica;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private int id;
    private List<Producto> productos;
    private String nombre;

    public CarritoDeCompras(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto añadido al carrito " + id +": "+ producto);
    }
    public String obtenerInformacion() {
        StringBuilder info = new StringBuilder();
        info.append("ID: ").append(id).append("\n");
        info.append("Nombre: ").append(nombre).append(" \n");

        if (productos.isEmpty()) {
            info.append("No hay productos en el carrito.\n");
        } else {
            info.append("Productos en el carrito:\n");
            for (Producto producto : productos) {
                info.append("\tID: ").append(producto.getId())
                    .append(", Descripción: ").append(producto.getDescripcion())
                    .append(", Cantidad: ").append(producto.getCantidad()).append("\n");
            }
        }

        return info.toString();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "CarritoDeCompras{" +
                "id=" + id +
                ", productos=" + productos +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}