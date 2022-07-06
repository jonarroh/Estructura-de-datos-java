package com.esfera;

public class TDA_Esfera {
    private double radio;

    public TDA_Esfera(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    public double getDiametro() {
        return radio * 2;
    }

    public double getCircunferencia() {
        return 2 * Math.PI * getRadio();
    }

    public double getSuperficie() {
        return 4 * Math.PI * Math.pow(getRadio(), 2);
    }
    public double getVolumen() {
        return (4 / 3) * Math.PI * Math.pow(getRadio(), 3);
    }
}
