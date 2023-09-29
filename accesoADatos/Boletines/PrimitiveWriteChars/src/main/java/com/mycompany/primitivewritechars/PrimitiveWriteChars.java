package com.mycompany.primitivewritechars;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrimitiveWriteChars {
    
    String read = "";

    public static void main(String[] args) throws IOException {
    
        PrimitiveWriteChars pwc = new PrimitiveWriteChars();
        pwc.primivitewritechar("/home/postgres/NetBeansProjects/PrimitiveWriteChars/src/textos/texto5.txt");
    
    }
    
    public void primivitewritechar(String path) throws FileNotFoundException, IOException{
    
    
        FileOutputStream fos = new FileOutputStream(path);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataOutputStream dos = new DataOutputStream(bos);
        
        FileInputStream fis = new FileInputStream(path);
        BufferedInputStream bis = new BufferedInputStream(fis);
        DataInputStream dis = new DataInputStream (bis);
        
        String xelido = "o tempo está xélido\n";
        int longitud = xelido.length();
        
        for(int i = 0; i<2; i++){
             
             System.out.println("Escribiendo: o tempo está xélido");
             System.out.println("La cadena es de "+longitud+" caracteres.");
             dos.writeChars(xelido);
             System.out.println("Se han escrito "+dos.size()+" bytes.");
        }
        dos.close();
        
        
        while(dis.available()!= 0){
                int x = 0;
                while(x < longitud){
                    read = read + dis.readChar();
                    x++;
                }
                System.out.println("Leemos la primera cadena: "+xelido);
                System.out.println("Tamaño del fichero que queda por leer: "+dis.available());
        }
        
    }
}
