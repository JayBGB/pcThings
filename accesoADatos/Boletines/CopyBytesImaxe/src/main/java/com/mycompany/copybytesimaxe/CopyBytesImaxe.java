package com.mycompany.copybytesimaxe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class CopyBytesImaxe {

    public static void main(String[] args) throws IOException {
    
        CopyBytesImaxe copy = new CopyBytesImaxe();
        
        copy.appCopyByteImaxe("/home/postgres/NetBeansProjects/CopyBytesImaxe/src/imagenes/foto.jpg");
        
    
    }
    
    public void appCopyByteImaxe(String path) throws FileNotFoundException, IOException{
        
        ArrayList <Integer> imaxeBytes = new ArrayList<Integer>();
        FileInputStream reader = new FileInputStream(path);
        
        while (reader.available() != 0){
        
            imaxeBytes.add(reader.read());
        }
        
        String path2="/home/postgres/NetBeansProjects/CopyBytesImaxe/src/imagenes/foto2.jpg";
        FileOutputStream writer = new FileOutputStream(path2, true);
        
        for(int x=0; x < imaxeBytes.size(); x++){
            
            writer.write(imaxeBytes.get(x));    
        }
        writer.close();
        
    }
}
