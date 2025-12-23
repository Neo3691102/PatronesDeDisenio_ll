package com.ebac.modulo55.Decorator;

public class TrianguloEquilatero extends FiguraDecorator{

    public TrianguloEquilatero(Figura figura) {
        super(figura);
    }

    @Override
    public String nombre() {
        return super.nombre() + "equilatero";
    }

    @Override
    public String formulaPerimetro() {
        return "3 * L";
    }
}
