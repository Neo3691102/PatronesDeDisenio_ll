package com.ebac.modulo55.Decorator;

public class TrianguloEscaleno extends FiguraDecorator{

    public TrianguloEscaleno(Figura figura) {
        super(figura);
    }

    @Override
    public String nombre() {
        return super.nombre() + "escaleno";
    }

    @Override
    public String formulaPerimetro() {
        return "L1 + L2 + L3";
    }
}
