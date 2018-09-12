package processadordemultas;

import java.io.File;

// Prática Paralelismo de Threads
// @Ncesar;
public class Main {
    public static void main(String[] args){
        String path = "C:\\Users\\user\\Desktop\\ProcessadordeMultas\\Multas\\";
        File diretorio = new File(path);
        File[] listaDeArquivos = diretorio.listFiles();
        for(int i = 0; i < listaDeArquivos.length; i++){
            if(listaDeArquivos[i].isFile()){              
            String nomeArquivos = listaDeArquivos[i].getName();
            ProcessadordeMultas p = new ProcessadordeMultas(path + nomeArquivos, i);
            Thread t = new Thread(p);
            t.start();
        }
    }
}
}