package aula.exemplo3;

public class ExemploNumerosRandomicos {
    public static void main(String[] args) {
        NumDoubleRandomico doubleRandomico = new NumDoubleRandomico();
        NumIntRandomico intRandomico = new NumIntRandomico();
        Thread threadDouble = new Thread(doubleRandomico);
        threadDouble.start();
        Thread threadInt = new Thread(intRandomico);
        threadInt.start();
        try {
            Thread.sleep(10000);
            NumDoubleRandomico.parar = 1;
            System.out.println("ExemploNumDoubleRandomico finalizado");
            Thread.sleep(10000);
            NumIntRandomico.parar = 1;
            System.out.println("ExemploNumIntRandomico finalizado");
        } catch (InterruptedException e) {}
    }
}
