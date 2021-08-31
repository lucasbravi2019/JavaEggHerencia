package com.bravi.Ejercicio2.Service;

import java.util.Scanner;

import com.bravi.Ejercicio2.Model.Televisor;

public class TelevisorService extends Televisor {

    Scanner scan = new Scanner(System.in);

    public void crearTelevisor() {
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion del televisor en pulgadas");
        setResolucion(scan.nextDouble());
        System.out.println("Ingrese si tiene sintonizador TDT (S/N)");
        scan.nextLine();
        String respuesta = scan.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            setSintonizadorTDT(true);
        } else {
            setSintonizadorTDT(false);
        }
    }

    public void mostrarTelevisor() {
        System.out.println(toString());
    }

    @Override
    public void precioFinal() {
        // TODO Auto-generated method stub
        super.precioFinal();
        if (getResolucion() > 40) {
            setPrecio(getPrecio() * 1.30);
        }
        if (getSintonizadorTDT()) {
            setPrecio(getPrecio() + 500);
        }
    }

}
