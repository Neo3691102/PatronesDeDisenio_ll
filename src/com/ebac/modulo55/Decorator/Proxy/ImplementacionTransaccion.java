package com.ebac.modulo55.Decorator.Proxy;

public class ImplementacionTransaccion implements Transaccion{
    private final Cuenta cuenta;

    public ImplementacionTransaccion(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void retirar(double monto) {
        double fondosActuales = this.cuenta.getFondos();
        this.cuenta.setFondos(fondosActuales - monto);
    }

    @Override
    public void depositar(double monto) {
        double fondosActuales = this.cuenta.getFondos();
        this.cuenta.setFondos(fondosActuales + monto);
    }

    @Override
    public double fondosActuales() {
        return this.cuenta.getFondos();
    }
}
