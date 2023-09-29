/**
 * Programa en Java que cree dos hilos y los ejecuta. Los hilos escriben diez veces
 * un número de iteración del bucle y su nombre. En cada iteración, después de escribir su nombre,
 * se bloquean durante un tiempo aleatorio de segundos y después vuelven a estar disponibles para su
 * ejecución.Programa en Java que cree dos hilos y los ejecuta. Los hilos escriben diez veces un
 * número de iteración del bucle y su nombre. En cada iteración, después de escribir su nombre,
 * se bloquean durante un tiempo aleatorio de segundos y después vuelven a estar disponibles
 * para su ejecución.
 */

public class Main extends Thread {
    public static void main(String[] args) {
        // Creación de los hilos
        //ThreadSleep hilo1 = new ThreadSleep("Juan Alberto");
        //ThreadSleep hilo2 = new ThreadSleep("María Isabel");

        // Ejecución de los hilos
       // hilo1.start();
       // hilo2.start();

        //Ejecución de los hilos Ejercicio 2
        // ThreadWaitSleep h1 = new ThreadWaitSleep("Juan Alberto");
        //  ThreadWaitSleep h2 = new ThreadWaitSleep("María Isabel");
        //  ThreadWaitSleep h3 = new ThreadWaitSleep("Andrés");
        // ThreadWaitSleep h4 = new ThreadWaitSleep("Sergio");

        // Ejecución EJ2
        // try {
        // h1.start();
        // h2.start();
        // h3.start();
        // h4.start();

        //  h1.join();
        //  h2.join();
        //  h3.join();
        // h4.join();

        //  } catch (InterruptedException e) {
        //      throw new RuntimeException(e);
        //  }

        ThreadEJ3 hilo = new ThreadEJ3("hilo 1");
        hilo.start();
        try {
            hilo.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}