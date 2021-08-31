package com.bravi.Ejercicio1.Model;

public class Perro extends Animal {

    public Perro() {

    }

    public Perro(String nombre, String alimento, int edad, String raza) {
        setNombre(nombre);
        setAlimento(alimento);
        setEdad(edad);
        setRaza(raza);
    }

    @Override
    public void Alimentarse() {
        // TODO Auto-generated method stub
        if (getAlimento().equalsIgnoreCase("carnivoro")) {
            System.out.println("Es " + getAlimento().toLowerCase());
        } else {
            System.out.println("Come " + getAlimento().toLowerCase());
        }
    }

}
