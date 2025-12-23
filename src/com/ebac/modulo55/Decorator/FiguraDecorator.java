package com.ebac.modulo55.Decorator;

public class FiguraDecorator implements Figura{
    Figura figura;

    public FiguraDecorator(Figura figura) {
        this.figura = figura;
    }

    @Override
    public String nombre() {
        return figura.nombre();
    }

    @Override
    public int vertices() {
        return figura.vertices();
    }

    @Override
    public String formulaPerimetro() {
        return figura.formulaPerimetro();
    }
}
