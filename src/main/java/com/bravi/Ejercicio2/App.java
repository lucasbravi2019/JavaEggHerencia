package com.bravi.Ejercicio2;

import com.bravi.Ejercicio2.Service.LavadoraService;
import com.bravi.Ejercicio2.Service.TelevisorService;

public class App {
    public static void main(String[] args) {
        LavadoraService l = new LavadoraService();
        l.crearLavadora();
        l.precioFinal();
        l.mostrarLavadora();
        TelevisorService t = new TelevisorService();
        t.crearTelevisor();
        t.precioFinal();
        t.mostrarTelevisor();
    }
}
