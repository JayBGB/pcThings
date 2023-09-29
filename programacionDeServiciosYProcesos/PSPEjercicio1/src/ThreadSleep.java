public class ThreadSleep extends Thread {

    public ThreadSleep(String str) {
        super(str);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + getName());
            try {
                // Bloqueo del hilo durante un tiempo aleatorio
                sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                System.err.println("Error en el sleep");
            }
        }
        System.out.println("Fin del hilo " + getName());
    }
}
