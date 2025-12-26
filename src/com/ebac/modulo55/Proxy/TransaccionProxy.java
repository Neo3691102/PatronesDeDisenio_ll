package com.ebac.modulo55.Proxy;

public class TransaccionProxy implements Transaccion{

    private final Transaccion transaccion;

    public TransaccionProxy(Cuenta cuenta) {
        this.transaccion = new ImplementacionTransaccion(cuenta);
    }


    @Override
    public void retirar(double monto) {
        double fondosActuales = this.transaccion.fondosActuales();
        if(fondosActuales - monto < 0){
            System.out.println("Error: fondos insuficientes para retirar la cantidad " + monto);
        }else{
            this.transaccion.retirar(monto);
            System.out.println("Retiro de " + monto + " exitoso");
        }
        System.out.println("Fondos actuales: " + this.transaccion.fondosActuales());
    }

    @Override
    public void depositar(double monto) {
        System.out.println("Deposito de " + monto);
        this.transaccion.depositar(monto);
        System.out.println("Fondos actuales: " + this.transaccion.fondosActuales());
    }

    @Override
    public double fondosActuales() {
        return 0;
    }
}
