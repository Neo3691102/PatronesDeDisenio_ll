package com.ebac.modulo55.State;

public class Contexto {
    public static void main(String[] args) {
        Mezclador mezclador = new Mezclador();
        mezclador.estado();

        mezclador.setEstado(new ReproducirMusica("Rock"));
        mezclador.estado();
        mezclador.setEstado(new DetenerMusica());
        mezclador.estado();
    }
}
