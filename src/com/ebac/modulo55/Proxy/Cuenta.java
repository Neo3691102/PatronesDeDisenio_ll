package com.ebac.modulo55.Proxy;

public class Cuenta {
    private double fondos;

    public Cuenta(double fondos) {
        this.fondos = fondos;
    }

    public double getFondos() {
        return fondos;
    }

    public void setFondos(double fondos) {
        this.fondos = fondos;
    }
}
