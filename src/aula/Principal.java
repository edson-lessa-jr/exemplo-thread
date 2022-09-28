package aula;

import aula.exemplo1.ThreadHeranca;
import aula.exemplo2.ThreadInterface;

public class Principal {
    public static void main(String[] args) {
        try {
            ThreadHeranca exemplo1 = new ThreadHeranca();
            exemplo1.start();

            for (int i = 0; i < 6; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
            ThreadInterface exemplo2 = new ThreadInterface();
            Thread exemplo2Tread = new Thread(exemplo2);
            exemplo2Tread.start();
            for (int i = 0; i < 6; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (RuntimeException | InterruptedException e){
            e.printStackTrace();
        }
    }
}