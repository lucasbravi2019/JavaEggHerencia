package com.bravi.Ejercicio3.Model;

import com.bravi.Ejercicio3.Service.ElectrodomesticoService;

public class Lavadora extends ElectrodomesticoService {

    private double carga;

    public Lavadora() {

    }

    public Lavadora(String color, char consumo, double peso, double carga) {
        super(color, consumo, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return this.carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "{" + " precio='" + getPrecio() + "'" + ", color='" + getColor() + "'" + ", consumo='" + getConsumo()
                + "'" + ", peso='" + getPeso() + "'" + ", carga='" + getCarga() + "'" + "}";
    }

}
