
package com.mycompany.figurasgeometricas;


public class Triangulo extends FigurasGeometricas {
    private double base;
    private double altura;

    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }
    //Complejidad temporal O(1)
    @Override
    public double obtenerArea() {
        return (base * altura) / 2;
    }
    //Complejidad temporal O(1)
    @Override
    public double obtenerPerimetro() {
        // Suponemos un triángulo equilátero para simplificar
        return 3 * base;
    }
}
