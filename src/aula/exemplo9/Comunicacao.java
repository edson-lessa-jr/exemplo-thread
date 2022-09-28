package aula.exemplo9;

public class Comunicacao implements Runnable {
    private String mensagem1;
    private String mensagem2;

    public Comunicacao(String mensagem1, String mensagem2) {
        this.mensagem1 = mensagem1;
        this.mensagem2 = mensagem2;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " - msg1 - Lock na " + mensagem1);
        synchronized (mensagem1) {
            System.out.println(Thread.currentThread().getName() + " - msg2 - Lock na " + mensagem2);
            synchronized (mensagem2) {
                System.out.println("Lock");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
        System.out.println("Saiu do lock");
    }
}
