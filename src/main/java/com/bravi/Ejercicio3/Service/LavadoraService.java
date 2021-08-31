package com.bravi.Ejercicio3.Service;

import java.util.Scanner;

import com.bravi.Ejercicio3.Model.Lavadora;

public class LavadoraService extends Lavadora {
    Scanner scan = new Scanner(System.in);

    public LavadoraService(String color, char consumo, double peso, double carga) {
        super(color, consumo, peso, carga);
        precioFinal();
    }

    public void crearLavadora() {
        // TODO Auto-generated method stub
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora");
        double carga = scan.nextDouble();
        setCarga(carga);
    }

    public void mostrarLavadora() {
        System.out.println(toString());
    }

    @Override
    public void precioFinal() {
        // TODO Auto-generated method stub
        super.precioFinal();
        if (getCarga() > 30) {
            setPrecio(getPrecio() + 500);
        }
    }

}
