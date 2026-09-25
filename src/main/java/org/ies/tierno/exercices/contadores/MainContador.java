package org.ies.tierno.exercices.contadores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainContador {
    public static void main(String[] args) {

        //
        ExecutorService executor = Executors.newFixedThreadPool(4);

        //
        executor.submit((new Contador(String.valueOf(1), 5)));
        executor.submit((new Contador(String.valueOf(2), 5)));
        executor.submit((new Contador(String.valueOf(3), 5)));
        executor.submit((new Contador(String.valueOf(4), 5)));

        // Ej2:
        System.out.println("El main ha terminado");

        //
        executor.shutdown();

        // Forma 1 de hacerlo
        // Thread t1 = new Thread(new Contador("Contador-2", 5));
        // Thread t2 = new Thread(new Contador("Contador-1", 5));
        //...
        // t1.start();
        // t2.start();
        //...
    }
}
