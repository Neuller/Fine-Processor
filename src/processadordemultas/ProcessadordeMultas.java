package processadordemultas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class ProcessadordeMultas implements Runnable {
    private String caminho;
    private int thread;
    
    public ProcessadordeMultas(String caminho, int i){
        this.caminho = caminho;
        this.thread = i;
    }

    @Override
    public void run() {
        Scanner in;
        try {
            in = new Scanner(new FileReader(caminho));
            while (in.hasNext()){
                String[] dados = in.next().split(";");
                String placa = dados[0];
                String valor = dados[1];
                System.out.println("Thread " + thread + "Placa do carro " + placa + "Valor da multa " + valor);
            }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
        }

    }


}
