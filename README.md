<p align="center">
  <img width="4023" height="997" alt="Captura desde 2026-09-25 13-13-58" src="https://github.com/user-attachments/assets/8dcb27c4-6412-4fcb-972f-1900ef1e04a1" />
</p>

<h1 align="center">PROGRAMACIÓN DE SERVICIOS Y PROCESOS</h1>

---

<h2>UT01 - PROGRAMACIÓN CONCURRENTE Y PARALELA</h2>

<h3>Ejercicios de programación multihilo</h3>

<h4>1. Los cuatro contadores</h4>

Crea una clase `Contador` que implemente `Runnable`. Esta clase define dos campos: `nombre` y `numVueltas`.

En `run()`, el hilo imprime `"Soy Contador-1, vuelta 3"` en cada iteración. Debe realizar tantas iteraciones como el valor de `numVueltas` y dormir un tiempo aleatorio entre 100 y 500 ms (usa `Random`).

Desde `main`, lanza 4 contadores con 5 vueltas cada uno.

---

<h4>2. El main impaciente</h4>

Parte del ejercicio anterior. Después de los `start()`, añade en `main`:

```java
System.out.println("El main ha terminado");
```

Ejecútalo. El mensaje aparece **antes** de que los contadores acaben.

Ahora añade un `join()` por cada hilo justo antes de esa línea y vuelve a ejecutar. Explica la diferencia en dos frases.

---

<h4>3. Carrera de tortugas</h4>

Cinco hilos, cada uno una tortuga. Cada tortuga avanza 20 pasos; entre paso y paso duerme un tiempo aleatorio entre 50 y 200 ms y en cada paso imprime su nombre y el número de paso.

El `main` espera a las cinco con `join()` y luego imprime `"Carrera terminada"`.

<h5>Ampliación</h5>

Que cada tortuga, al llegar al paso 20, imprima:

```text
¡Tortuga-3 ha llegado a la meta!
```

Ejecuta varias veces y comprueba que no siempre gana la misma.

---

<h4>4. Sumar un array entre varios</h4>

Crea un array de 40 elementos y 4 hilos. Cada hilo suma 10 posiciones (el hilo 0 las posiciones 0–9, el hilo 1 las 10–19, etc.) y guarda su resultado en un atributo propio con su `getter`.

```java
class Sumador {
    private int[] datos;
    private int desde;
    private int hasta;
    private int suma;

    // Constructor

    public int getSuma() {
        return suma;
    }
}
```

El `main` lanza los cuatro hilos y, cuando estos hayan terminado, suma los cuatro resultados parciales y muestra el total.

---

<h4>5. La cuenta bancaria compartida</h4>

Tenemos una clase `Cuenta` con un saldo y dos operaciones:

```java
public class Cuenta {
    private int saldo = 0;

    public void ingresar(int cantidad) {
        saldo = saldo + cantidad;
    }

    public int getSaldo() {
        return saldo;
    }
}
```

Crea 2 hilos que compartan **la misma instancia** de `Cuenta`. Cada hilo hace 100.000 ingresos de 1 euro.

<h5>El main debe</h5>

1. Crear un solo objeto `Cuenta` y pasárselo a los dos hilos.
2. Lanzar los dos hilos.
3. Esperar a que terminen con `join()`.
4. Imprimir el saldo final.
