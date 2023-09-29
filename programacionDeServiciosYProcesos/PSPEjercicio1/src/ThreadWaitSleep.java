/**
 * Programa que crea 4 hilos, los ejecuta y espera la que estos terminen.
 * Los hilos escriben 5 veces el número de iteración del bucle y su
 * nombre. En cada iteración, después de escribir su nombre, se bloquean
 * durante un tiempo aleatorio de segundos y después vuelven a estar
 * disponibles para su ejecución.
 */

public class ThreadWaitSleep extends Thread {

    public ThreadWaitSleep(String str){

        super(str);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ": " + getName());
            try {
                // Bloqueo del hilo durante un tiempo aleatorio
                sleep((long) (1000));
            } catch (InterruptedException e) {
                System.err.println("Error en el sleep");
            }
        }
        System.out.println("Fin del hilo " + getName());
    }
}



