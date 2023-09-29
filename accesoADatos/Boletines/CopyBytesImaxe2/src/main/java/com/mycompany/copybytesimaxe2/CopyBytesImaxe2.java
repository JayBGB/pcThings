package com.mycompany.copybytesimaxe2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class CopyBytesImaxe2 {

    public static void main(String[] args) throws IOException {
    
        CopyBytesImaxe2 copy = new CopyBytesImaxe2();
        
        copy.appCopyByteImaxe("/home/postgres/NetBeansProjects/CopyBytesImaxe/src/imagenes/foto.jpg");
        
    
    }
    
    public void appCopyByteImaxe(String path) throws FileNotFoundException, IOException{
        
        ArrayList <Integer> imaxeBytes = new ArrayList<Integer>();
        FileInputStream reader = new FileInputStream(path);
        BufferedInputStream breader = new BufferedInputStream(reader);
        
        while (breader.available() != 0){
        
            imaxeBytes.add(breader.read());
        }
        
        String path2="/home/postgres/NetBeansProjects/CopyBytesImaxe/src/imagenes/foto2.jpg";
        FileOutputStream writer = new FileOutputStream(path2, true);
        BufferedOutputStream bwriter = new BufferedOutputStream(writer);
        
        for(int x=0; x < imaxeBytes.size(); x++){
            
            bwriter.write(imaxeBytes.get(x));    
        }
        bwriter.close();
        
    }
}
