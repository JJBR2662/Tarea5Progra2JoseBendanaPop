package tarea5progra2josebendañapop;

import java.util.Date;

public class Liquido {
    private String categoria;
    private String empaque;
    private String tamanio;
    private String nombre;
    private int precio;
    private Date vencimiento;
    private int cantidad;

    public Liquido(String categoria, String empaque, String tamanio, String nombre, int precio, Date vencimiento, int cantidad) {
        this.categoria = categoria;
        this.empaque = empaque;
        this.tamanio = tamanio;
        this.nombre = nombre;
        this.precio = precio;
        this.vencimiento = vencimiento;
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEmpaque() {
        return empaque;
    }

    public void setEmpaque(String empaque) {
        this.empaque = empaque;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Liquido{" + "categoria=" + categoria + ", empaque=" + empaque + ", tamanio=" + tamanio + ", nombre=" + nombre + ", precio=" + precio + ", vencimiento=" + vencimiento + ", cantidad=" + cantidad + '}';
    }
}
