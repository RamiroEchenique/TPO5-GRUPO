
package com.mycompany.tp5_lab1;

/**
 *
 * @author ECHENIQUE RAMIRO
 *          NADIA CODINA
 *          MICAELA ZAMO
 */
public class Producto {
    String nombre;
    double precio;
    String categoria;
    
    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

  

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    

   
    
    
    
}
