package ar.edu.unju.fi.tp3_grupo22.ejercicio9;

public class Producto {
    private int codigo;
    private String descripcion;
    private double precio;
    private String marca;

    public Producto() {
    }

    public Producto(int codigo, String descripcion, double precio, String marca) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.marca = marca;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
