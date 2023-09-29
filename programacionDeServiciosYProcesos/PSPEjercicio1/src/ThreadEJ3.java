import java.util.Random;

public class ThreadEJ3 extends Thread{

    private static int contador = 1;
    private String nombre;
    private Thread hiloHijo;

    public ThreadEJ3(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.println(nombre + " comenzó.");

        if (contador <= 5) {
            hiloHijo = new Thread(new ThreadEJ3("Hilo " + (contador + 1)));
            hiloHijo.start();
            contador++;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(nombre + " se está procesando (" + i + "/10).");
            try {
                Thread.sleep(new Random().nextInt(501) + 100); // Esperar de 100 a 600 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (hiloHijo != null) {
            try {
                hiloHijo.join(); // Esperar a que el hilo hijo termine
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(nombre + " finalizó.");
    }
}