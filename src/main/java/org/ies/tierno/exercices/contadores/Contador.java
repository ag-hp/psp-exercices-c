package org.ies.tierno.exercices.contadores;

import org.ies.tierno.task.Tarea;

import java.util.Random;

public class Contador implements Runnable {

   // Clase define dos campos
   private final String nombre;
   private final int numVueltas;

   // Random = Aleatorio
   private Random random = new Random();


   // Contructor
   public Contador(String nombre, int numVueltas){
      this.nombre = nombre;
      this.numVueltas = numVueltas;
   }

   // Metodo run
   @Override // Esto es una anotaciuón, lleva "@"
   public void run() {

      // fori
      for (int i = 0; i < numVueltas; i++) { //Forma 2 si no ponemos la forms 3 se denbería cambiar: for (int i = 1; i <= numVueltas; i++)
         System.out.println("Soy " + nombre + ", vuelta " + i); // Forma 3 de hacerlo para que empiece a sumar desde la primer vuelta (i + 1)

         // Poniendo "Thread.sleep(numRandom);" nos hace el try catch
         try {
            int time = random.nextInt(400) + 100;
              Thread.sleep(time);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
      }
   }
}

