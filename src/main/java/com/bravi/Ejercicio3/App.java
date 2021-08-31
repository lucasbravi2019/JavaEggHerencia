package com.bravi.Ejercicio3;

import java.util.ArrayList;

import com.bravi.Ejercicio3.Model.Electrodomestico;
import com.bravi.Ejercicio3.Service.LavadoraService;
import com.bravi.Ejercicio3.Service.TelevisorService;

public class App {
    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
        LavadoraService l = new LavadoraService("blanco", 'A', 45.6, 30);
        TelevisorService t = new TelevisorService("negro", 'B', 50, 45, true);
        electrodomesticos.add(l);
        electrodomesticos.add(t);
        double precioElectrodomesticos = 0;
        double precioLavadoras = 0;
        double precioTelevisores = 0;
        for (int i = 0; i < electrodomesticos.size(); i++) {
            if (electrodomesticos.get(i).getClass() == LavadoraService.class) {
                precioLavadoras += electrodomesticos.get(i).getPrecio();
            }
            if (electrodomesticos.get(i).getClass() == TelevisorService.class) {
                precioTelevisores += electrodomesticos.get(i).getPrecio();
            }
        }
        precioElectrodomesticos = precioLavadoras + precioTelevisores;
        System.out.println("El precio de las lavadoras es: " + precioLavadoras);
        System.out.println("El precio de los televisores es: " + precioTelevisores);
        System.out.println("El precio total de los electrodomesticos es: " + precioElectrodomesticos);
    }
}
