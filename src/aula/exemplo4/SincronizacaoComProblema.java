package aula.exemplo4;

public class SincronizacaoComProblema extends Thread {
    public static int contador = 0;
    public void run() {
        for (int i=1;i<=10;i++)
            incrementarContador();
    }
    public void incrementarContador() {
        contador++;
        System.out.println(this.getName() + " - " + contador);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }
    public static void main(String[] args) throws InterruptedException {
        SincronizacaoComProblema sinc1 = new SincronizacaoComProblema();
        Thread thread1 = new Thread(sinc1);
        thread1.start();
        Thread thread2 = new Thread(sinc1);
        thread2.start();
    }
}