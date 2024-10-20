package com.mycompany.figurasgeometricas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Complejidad temporal O(1)
        System.out.println("Ingrese el nombre de la figura:");
        String nombre = sc.nextLine();

        //Complejidad temporal O(1)
        System.out.println("Ingrese el color de la figura:");
        String color = sc.nextLine();

        //Complejidad temporal O(1)
        System.out.println("Ingrese el tipo de figura (1: Círculo, 2: Rectángulo, 3: Triángulo):");
        int tipoFigura = sc.nextInt();

        FigurasGeometricas figura = null;

        //Complejidad temporal O(1)
        switch (tipoFigura) {
            case 1:
                //Complejidad temporal O(1)
                System.out.println("Ingrese el radio del círculo:");
                double radio = sc.nextDouble();
                figura = new Circulo(nombre, color, radio);
                break;

            case 2:
                //Complejidad temporal O(1)9
                System.out.println("Ingrese el valor del lado 1 del rectángulo:");
                double lado1 = sc.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectángulo:");
                double lado2 = sc.nextDouble();
                figura = new Rectangulo(nombre, color, lado1, lado2);
                break;

            case 3:
                //Complejidad temporal O(1)
                System.out.println("Ingrese el valor de la base del triángulo:");
                double base = sc.nextDouble();
                System.out.println("Ingrese el valor de la altura del triángulo:");
                double altura = sc.nextDouble();
                figura = new Triangulo(nombre, color, base, altura);
                break;

            default:
                //Complejidad temporal O(1)
                System.out.println("Tipo de figura no válido");
                System.exit(0);
        }
        //Complejidad temporal O(1)
        System.out.println("El área de " + figura.getNombre() + " es: " + figura.obtenerArea());
        System.out.println("El perímetro de " + figura.getNombre() + " es: " + figura.obtenerPerimetro());
    }
}
