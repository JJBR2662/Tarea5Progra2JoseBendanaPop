package tarea5progra2josebendañapop;

public class Grano {
    
    private String nombre;
    private int cantidadquin;
    private int precio;
    private String unidadmedida;
    private String lugar;

    public Grano(String nombre, int cantidadquin, int precio, String unidadmedida, String lugar) {
        this.nombre = nombre;
        this.cantidadquin = cantidadquin;
        this.precio = precio;
        this.unidadmedida = unidadmedida;
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadquin() {
        return cantidadquin;
    }

    public void setCantidadquin(int cantidadquin) {
        this.cantidadquin = cantidadquin;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getUnidadmedida() {
        return unidadmedida;
    }

    public void setUnidadmedida(String unidadmedida) {
        this.unidadmedida = unidadmedida;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Grano{" + "nombre=" + nombre + ", cantidadquin=" + cantidadquin + ", precio=" + precio + ", unidadmedida=" + unidadmedida + ", lugar=" + lugar + '}';
    }
    
    
}
