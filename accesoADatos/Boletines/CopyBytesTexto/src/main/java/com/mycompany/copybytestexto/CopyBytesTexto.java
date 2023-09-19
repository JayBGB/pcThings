package com.mycompany.copybytestexto;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class CopyBytesTexto {
    
    public static void main(String[] args) throws IOException {
    
        CopyBytesTexto test = new CopyBytesTexto();
        
        test.appCopyBytesTexto("/home/dam2/NetBeansProjects/CopyBytesTexto/src/texto/texto1.txt");
    }
    
    public void appCopyBytesTexto(String path) throws FileNotFoundException, IOException{
        
        ArrayList textoBytes = new ArrayList();
        float aux;
        FileInputStream reader = new FileInputStream(path);
        
        while ((aux=reader.read())!= -1){
        
            textoBytes.add(reader.read());
        }
        
        String path2="/home/dam2/NetBeansProjects/CopyBytesTexto/src/texto/texto2.txt";
        FileOutputStream writer = new FileOutputStream(path2);
        
        for(int x=0; x > textoBytes.size(); x++){
            
            writer.write((int) textoBytes.get(x));
        }
        
    }
    
    
 
}


