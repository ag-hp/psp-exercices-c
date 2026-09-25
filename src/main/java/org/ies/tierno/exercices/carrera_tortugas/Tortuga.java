package org.ies.tierno.exercices.carrera_tortugas;

import java.util.Random;

public class Tortuga implements Runnable {
    private String nombre;

    // // El constructor
    public Tortuga(String nombre, Random random) {
        this.nombre = nombre; // Asignamos el nombre recibido a la variable de la clase
    }


    @Override
    public void run() {
        for (int paso = 1; paso <= 20; paso++) {
            System.out.println(nombre + " - paso " + paso);
            // Colocamos la pausa dentro de un bloque try-catch obligatoriamente.
            try {
                // Al poner un tiempo fijo sencillito sin Random, el código queda mucho más limpio.
                Thread.sleep(100); // Congela el hilo durante 100 milisegundos (0.1 segundos).
            } catch (InterruptedException e) {
                // Si ocurre algún problema o interrupción durante la pausa, salta aquí
                throw new RuntimeException(e);
            }
            // Ampliacion
            System.out.println("¡" + nombre + " ha llegado a la meta!");
        }
    }
}