package com.bravi.Ejercicio3.Service;

import java.util.Scanner;

import com.bravi.Ejercicio3.Interface.Electro;
import com.bravi.Ejercicio3.Model.Electrodomestico;

public class ElectrodomesticoService extends Electrodomestico implements Electro {

    Scanner scan = new Scanner(System.in);

    public ElectrodomesticoService() {

    }

    public ElectrodomesticoService(String color, char consumo, double peso) {
        super(color, consumo, peso);
        comprobarConsumoElectrico(consumo);
        comprobarColor(color);
    }

    @Override
    public void comprobarConsumoElectrico(char letra) {
        // TODO Auto-generated method stub
        String consumo = String.valueOf(letra);
        if (!consumo.equalsIgnoreCase("a") && !consumo.equalsIgnoreCase("b") && !consumo.equalsIgnoreCase("c")
                && !consumo.equalsIgnoreCase("d") && !consumo.equalsIgnoreCase("e") && !consumo.equalsIgnoreCase("f")) {
            setConsumo('F');
        } else {
            setConsumo(consumo.toUpperCase().charAt(0));
        }
    }

    @Override
    public void comprobarColor(String color) {
        // TODO Auto-generated method stub
        if (!color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("negro") && !color.equalsIgnoreCase("rojo")
                && !color.equalsIgnoreCase("azul") && !color.equalsIgnoreCase("gris")) {
            setColor("blanco");
        } else {
            setColor(color);
        }
    }

    @Override
    public void crearElectrodomestico() {
        // TODO Auto-generated method stub
        System.out.println("Ingrese el color");
        String color = scan.next();
        System.out.println("Ingrese el consumo ( A a F )");
        char consumo = scan.next().charAt(0);
        System.out.println("Ingrese el peso");
        double peso = scan.nextDouble();
        setPeso(peso);
        comprobarConsumoElectrico(consumo);
        comprobarColor(color);
        precioFinal();
    }

    @Override
    public void precioFinal() {
        // TODO Auto-generated method stub
        double precio = 0;
        char consumo = getConsumo();
        double peso = getPeso();
        if (consumo == 'A') {
            precio += 1000;
        }
        if (consumo == 'B') {
            precio += 800;
        }
        if (consumo == 'C') {
            precio += 600;
        }
        if (consumo == 'D') {
            precio += 500;
        }
        if (consumo == 'E') {
            precio += 300;
        }
        if (consumo == 'F') {
            precio += 100;
        }
        if (peso >= 1 && peso <= 19) {
            precio += 100;
        }
        if (peso >= 20 && peso <= 49) {
            precio += 500;
        }
        if (peso >= 50 && peso <= 79) {
            precio += 800;
        }
        if (peso > 80) {
            precio += 1000;
        }
        setPrecio(precio);
    }

}
