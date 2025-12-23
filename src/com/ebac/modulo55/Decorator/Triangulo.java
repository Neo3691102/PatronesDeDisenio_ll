package com.ebac.modulo55.Decorator;

public class Triangulo implements Figura{

    @Override
    public String nombre() {
        return "Triangulo";
    }

    @Override
    public int vertices() {
        return 3;
    }

    @Override
    public String formulaPerimetro() {
        return "Depende del tipo de triangulo";
    }
}
