package aula.exemplo4;

public class SincronizacaoCorreta extends Thread {
    public static int contador = 0;
    public void run() {
        // comando para sincronizar as threads
        synchronized (this) {
            for (int i=1;i<=10;i++)
                incrementarContador();
        }
    }
    public void incrementarContador() {
        contador++;
        System.out.println(this.getName() + " - " + contador);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }
    public static void main(String[] args) throws InterruptedException {
        SincronizacaoCorreta sinc1 = new SincronizacaoCorreta();
        Thread thread1 = new Thread(sinc1);
        thread1.start();
        Thread thread2 = new Thread(sinc1);
        thread2.start();
    }
}