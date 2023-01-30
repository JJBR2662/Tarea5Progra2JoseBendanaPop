package tarea5progra2josebendañapop;

public class Frutasverduras {
    
    private int precio;
    private int cantidad;
    private String categoria;

    public Frutasverduras(int precio, int cantidad, String categoria) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Frutasverduras{" + "precio=" + precio + ", cantidad=" + cantidad + ", categoria=" + categoria + '}';
    }
    
    
}
