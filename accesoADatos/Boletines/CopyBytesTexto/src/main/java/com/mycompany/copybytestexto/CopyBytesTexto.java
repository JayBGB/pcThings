package com.mycompany.copybytestexto;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class CopyBytesTexto {
    
    public static void main(String[] args) throws IOException {
    
        CopyBytesTexto test = new CopyBytesTexto();
        
        test.appCopyBytesTexto("/home/postgres/pcThings/accesoADatos/Boletines/CopyBytesTexto/textos/texto1.txt");
    }
    
    public void appCopyBytesTexto(String path) throws FileNotFoundException, IOException{
        
        ArrayList <Integer> textoBytes = new ArrayList<Integer>();
        FileInputStream reader = new FileInputStream(path);
        
        while (reader.available() != 0){
        
            textoBytes.add(reader.read());
        }
        
        String path2="/home/postgres/pcThings/accesoADatos/Boletines/CopyBytesTexto/textos/texto2.txt";
        FileOutputStream writer = new FileOutputStream(path2, true);
        
        for(int x=0; x < textoBytes.size(); x++){
            
            writer.write(textoBytes.get(x));    
        }
        writer.close();
        
    }
    
    
 
}


