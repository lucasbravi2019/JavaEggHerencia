package com.bravi.Ejercicio4.Service;

import com.bravi.Ejercicio4.Interface.CalculosFormas;
import com.bravi.Ejercicio4.Model.Circulo;

public class CirculoService extends Circulo implements CalculosFormas {

    public CirculoService() {

    }

    public CirculoService(double radio) {
        super(radio);
    }

    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        return pi * Math.pow(getRadio(), 2);
    }

    @Override
    public double calcularPerimetro() {
        // TODO Auto-generated method stub
        return pi * getRadio();
    }

}
