package aula.exemplo1;

public class ThreadHeranca extends Thread{

    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Executando a Thread 1 de Exemplo");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
