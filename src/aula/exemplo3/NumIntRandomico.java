package aula.exemplo3;

import java.util.concurrent.ThreadLocalRandom;

public class NumIntRandomico implements Runnable{
    public static int parar = 0;
    public void run() {
        while (parar == 0) {
            int num = ThreadLocalRandom.current().nextInt(0, 9);
            System.out.println("Numero: " + num);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}
