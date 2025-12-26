package com.ebac.modulo55.State;

public class DetenerMusica implements EstadoMusica{
    @Override
    public void Estado() {
        System.out.println("Musica detenida");
    }
}
