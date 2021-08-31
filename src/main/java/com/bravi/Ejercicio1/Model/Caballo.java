package com.bravi.Ejercicio1.Model;

public class Caballo extends Animal {
    public Caballo() {

    }

    public Caballo(String nombre, String alimento, int edad, String raza) {
        setNombre(nombre);
        setAlimento(alimento);
        setEdad(edad);
        setRaza(raza);
    }

    @Override
    public void Alimentarse() {
        // TODO Auto-generated method stub
        System.out.println("Come " + getAlimento().toLowerCase());
    }
}
