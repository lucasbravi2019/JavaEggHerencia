package com.bravi.Ejercicio3.Model;

public class Electrodomestico {

    private double precio;

    private String color;

    private char consumo;

    private double peso;

    public Electrodomestico() {

    }

    public Electrodomestico(String color, char consumo, double peso) {
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return this.consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "{" + " precio='" + getPrecio() + "'" + ", color='" + getColor() + "'" + ", consumo='" + getConsumo()
                + "'" + ", peso='" + getPeso() + "'" + "}";
    }

}
