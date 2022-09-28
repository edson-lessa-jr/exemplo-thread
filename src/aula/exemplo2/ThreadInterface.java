package aula.exemplo2;

public class ThreadInterface implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Executando a Thread 2 de Exemplo com Runnable");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
