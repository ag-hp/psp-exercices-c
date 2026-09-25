package org.ies.tierno.exercices.cuenta_bancaria;

public class Cuenta implements Runnable {

    private int saldo = 0;

    public void ingresar(int cantidad) {
        saldo = saldo + cantidad;
    }

    public int getSaldo() {
        return saldo;
    }

    @Override
    public void run() {

    }
}
