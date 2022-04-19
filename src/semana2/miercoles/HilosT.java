package semana2.miercoles;

import java.lang.Thread;

public class HilosT extends Thread {

    // Este método se utiliza para definir la acción que realizara el hilo
    @Override
    public void run() {
        System.out.println("Este es mi hilo :D");
    }

    public static void main(String[] args) {
        HilosT myThread = new HilosT(); // Creamos la referencia al hilo.
        myThread.start();   // Iniciamos el hilo. Llamada implícita al método run().

        try {
            sleep(5000);
        }
        catch (InterruptedException ex) {
            System.out.println("No se pudo mandar a dormir");
        }

        myThread.stop();
    }
}
