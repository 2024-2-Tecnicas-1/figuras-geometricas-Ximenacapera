
package com.mycompany.figurasgeometricas;

public class Circulo extends FigurasGeometricas{
    private double radio;

    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }
    //Complejidad temporal O(1)
    @Override
    public double obtenerArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    //Complejidad temporal O(1)
    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
}
