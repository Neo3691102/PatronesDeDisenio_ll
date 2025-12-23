package com.ebac.modulo55.Decorator;

public class TrianguloIsoceles extends FiguraDecorator{

    public TrianguloIsoceles(Figura figura) {
        super(figura);
    }

    @Override
    public String nombre() {
        return super.nombre() + "Isoceles";
    }

    @Override
    public String formulaPerimetro() {
        return "(2 * L) + B";
    }
}
