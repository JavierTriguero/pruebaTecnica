package pruebaTecnica;

public class Producto {
    private int id;
    private String descripcion;
    private int cantidad;

    public Producto(int id, String descripcion, int cantidad) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
