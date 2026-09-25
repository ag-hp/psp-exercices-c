package org.ies.tierno.exercices.carrera_tortugas;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainTortuga {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        var es = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            es.submit(new Tortuga("Tortuga- "+ i, random));
        }

        // es.shutdown(); // no se bloquea
        es.awaitTermination(1, TimeUnit.MINUTES); // bloquea porque espera que todas las tareas finalicen
        System.out.println("Carrera terminada");
    }
}
