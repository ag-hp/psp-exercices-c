package org.ies.tierno.exercices.suma_array;

public class Sumador implements Runnable {

    private int[] datos;
    private int desde;
    private int hasta;
    private int suma;

    public Sumador(int[] datos, int desde, int hasta, int suma) {
        this.datos = datos;
        this.desde = desde;
        this.hasta = hasta;
        this.suma = 0;
    }

    public int getSuma() {
        return suma;
    }


    @Override
    public void run() {

    }
}
