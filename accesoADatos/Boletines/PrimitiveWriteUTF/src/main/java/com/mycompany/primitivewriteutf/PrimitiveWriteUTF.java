package com.mycompany.primitivewriteutf;

import java.io.DataOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrimitiveWriteUTF {
    
    String read = "";
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
    
        PrimitiveWriteUTF pwu = new PrimitiveWriteUTF();
        pwu.primivitewriteutf("/home/postgres/NetBeansProjects/PrimitiveWriteUTF/src/textos/texto3.txt");
    }
    
    public void primivitewriteutf(String path) throws FileNotFoundException, IOException{
    
    
        FileOutputStream fos = new FileOutputStream(path);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataOutputStream dos = new DataOutputStream(bos);
        
        FileInputStream fis = new FileInputStream(path);
        BufferedInputStream bis = new BufferedInputStream(fis);
        DataInputStream dis = new DataInputStream (bis);
        
        for(int i = 0; i<3; i++){
             dos.writeUTF("o tempo está xélido\n");
             System.out.println("El archivo pesa "+dos.size()+".");
        }
        dos.close();
        
        
        while(dis.available()!=0){

            read = read + dis.readUTF();
            System.out.println("Tamaño del fichero que queda por leer: "+dis.available());
        }
        System.out.println(read);
    }
}
