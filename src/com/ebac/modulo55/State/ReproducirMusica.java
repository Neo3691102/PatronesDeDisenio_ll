package com.ebac.modulo55.State;

public class ReproducirMusica implements EstadoMusica{
    private final String generoMusica;

    public ReproducirMusica(String generoMusica) {
        this.generoMusica = generoMusica;
    }

    @Override
    public void Estado() {
        System.out.println("Musica en reproduccion del genero " + this.generoMusica);
    }
}
