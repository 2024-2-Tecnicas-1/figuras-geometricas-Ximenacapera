
package com.mycompany.figurasgeometricas;


public abstract class FigurasGeometricas {
    private String nombre;
    private String color;

    public FigurasGeometricas(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    //Complejidad temporal O(1)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double obtenerArea();
    public abstract double obtenerPerimetro();
}
    
