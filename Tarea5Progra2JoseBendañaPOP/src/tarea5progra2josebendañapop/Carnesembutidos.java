package tarea5progra2josebendañapop;

public class Carnesembutidos {
    private String lugarproce;
    private int cantidad;
    public String tipo;
    public int precio;

    public Carnesembutidos(String lugarproce, int cantidad, String tipo, int precio) {
        this.lugarproce = lugarproce;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getLugarproce() {
        return lugarproce;
    }

    public void setLugarproce(String lugarproce) {
        this.lugarproce = lugarproce;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Carnesembutidos{" + "lugarproce=" + lugarproce + ", cantidad=" + cantidad + ", tipo=" + tipo + ", precio=" + precio + '}';
    }
    
    
}
