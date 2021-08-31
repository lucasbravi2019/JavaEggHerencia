package com.bravi.Ejercicio1;

import com.bravi.Ejercicio1.Model.Animal;
import com.bravi.Ejercicio1.Model.Caballo;
import com.bravi.Ejercicio1.Model.Gato;
import com.bravi.Ejercicio1.Model.Perro;

public class App {
    public static void main(String[] args) {
        Animal perro = new Perro("Stitch", "Carnivoro", 15, "Doberman");
        perro.Alimentarse();

        Animal perro1 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro1.Alimentarse();

        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato.Alimentarse();

        Animal caballo = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo.Alimentarse();

    }
}
