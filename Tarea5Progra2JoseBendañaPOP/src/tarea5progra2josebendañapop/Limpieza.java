package tarea5progra2josebendañapop;

public class Limpieza {
    private String tipo;
    private String marca;
    private String codigo;
    private int precio;
    private int cantidad;
    private String proveedor;
    private String nombre;

    public Limpieza(String tipo, String marca, String codigo, int precio, int cantidad, String proveedor, String nombre) {
        this.tipo = tipo;
        this.marca = marca;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Limpieza{" + "tipo=" + tipo + ", marca=" + marca + ", codigo=" + codigo + ", precio=" + precio + ", cantidad=" + cantidad + ", proveedor=" + proveedor + ", nombre=" + nombre + '}';
    }
    
    
    
}
