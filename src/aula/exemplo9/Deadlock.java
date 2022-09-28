package aula.exemplo9;

public class Deadlock {
    public static void main(String[] args) {
        String envio1 = new String("Mensagem 1");
        String envio2 = new String("Mensagem 2");
        String envio3 = new String("Mensagem 3");
        Thread thread1 = new Thread(new Comunicacao(envio1, envio2), "THREAD 1");
        thread1.start();

        Thread thread2 = new Thread(new Comunicacao(envio2, envio3), "THREAD 2");
        thread2.start();
        Thread thread3 = new Thread(new Comunicacao(envio3, envio1), "THREAD 3");
        thread3.start();
    }
}
