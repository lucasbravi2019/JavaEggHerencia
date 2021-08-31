package com.bravi.Ejercicio2.Model;

import com.bravi.Ejercicio2.Service.ElectrodomesticoService;

public class Televisor extends ElectrodomesticoService {

    private double resolucion;

    private boolean sintonizadorTDT;

    public Televisor() {

    }

    public Televisor(double precio, String color, char consumo, double peso, double resolucion,
            boolean sintonizadorTDT) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return this.resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return this.sintonizadorTDT;
    }

    public boolean getSintonizadorTDT() {
        return this.sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return "{" + " precio='" + getPrecio() + "'" + ", color='" + getColor() + "'" + ", consumo='" + getConsumo()
                + "'" + ", peso='" + getPeso() + "'" + ", resolucion='" + getResolucion() + "'" + ", sintonizadorTDT='"
                + isSintonizadorTDT() + "'" + "}";
    }

}
