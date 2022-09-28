package aula.exemplo10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class ArquivoMemoriaLeitura {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws FileNotFoundException, IOException,
            InterruptedException {
        long bufferSize = 8 * 10000;
        File arquivo = new File("arquivos\\arquivo_memoria.txt");
        FileChannel fileChannel = new RandomAccessFile(arquivo, "r").getChannel();
        MappedByteBuffer mp = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, bufferSize);
        mp.load();
        byte[] bytes = new byte[23];
        for (int i=0;i<=mp.limit()-1;i++) {
            mp.get(bytes);
            String valor = new String(bytes);
            if (!valor.trim().isEmpty()) {
                System.out.println(new String(bytes));
            } else {
                break;
            }
        }
    }
}
