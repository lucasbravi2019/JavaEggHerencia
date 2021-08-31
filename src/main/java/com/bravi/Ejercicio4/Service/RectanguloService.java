package com.bravi.Ejercicio4.Service;

import com.bravi.Ejercicio4.Interface.CalculosFormas;
import com.bravi.Ejercicio4.Model.Rectangulo;

public class RectanguloService extends Rectangulo implements CalculosFormas {

    public RectanguloService() {

    }

    public RectanguloService(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        return getBase() * getAltura();
    }

    @Override
    public double calcularPerimetro() {
        // TODO Auto-generated method stub
        return getBase() * 2 + getAltura() * 2;
    }

}
