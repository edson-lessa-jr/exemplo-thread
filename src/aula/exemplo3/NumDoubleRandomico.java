package aula.exemplo3;

import java.util.concurrent.ThreadLocalRandom;

public class NumDoubleRandomico implements Runnable {
    public static int parar = 0;
    public void run() {
        while (parar == 0) {
            double num = ThreadLocalRandom.current().nextDouble(0, 9);
            System.out.println("Numero: " + num);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }
    }
}
