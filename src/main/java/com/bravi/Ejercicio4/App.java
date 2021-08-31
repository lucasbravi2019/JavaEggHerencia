package com.bravi.Ejercicio4;

import com.bravi.Ejercicio4.Service.CirculoService;
import com.bravi.Ejercicio4.Service.RectanguloService;

public class App {
    public static void main(String[] args) {
        CirculoService c = new CirculoService(3.12);
        RectanguloService r = new RectanguloService(5.14, 9.23);
        System.out.println("Circulo");
        System.out.println("Area");
        System.out.println(c.calcularArea());
        System.out.println("Perimetro");
        System.out.println(c.calcularPerimetro());
        System.out.println("Rectangulo");
        System.out.println("Area");
        System.out.println(r.calcularArea());
        System.out.println("Perimetro");
        System.out.println(r.calcularPerimetro());
    }
}
