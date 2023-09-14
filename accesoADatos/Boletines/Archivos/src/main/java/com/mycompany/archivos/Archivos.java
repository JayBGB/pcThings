package com.mycompany.archivos;
import java.io.File;

public class Archivos {

    public static void main(String[] args) {}
    
    
    
    public void File (String str){}
    
    public void eDirectorio (String cadena){
    
        File file = new File (cadena);
        boolean condition = file.isDirectory();
        
        if(condition){
        
            System.out.println("Es un directorio.");
        }else{
        
            System.out.println("No es un directorio.");
        }
    
    }
    
    public void eFichero (String cadena){
    
        File file = new File (cadena);
        boolean condition = file.isFile();
        
        if(condition){
        
            System.out.println("Es un archivo.");
        }else{
        
            System.out.println("No es un archivo.");
        }
    }
    
    public void creaDirectorio(String cadena){
    
        File file = new File (cadena);
        boolean condition = file.isDirectory();
        
        if(condition){
        
            System.out.println("Ya es un directorio.");
        }else{
        
            file.mkdir();
            System.out.println("Directorio creado.");
        }
    }
    
    public void creaFichero(String dirName, String fileName) throws Exception{
    
        try{
        File dir = new File (dirName);
        boolean isAbso = dir.isAbsolute();
        boolean dirExists = dir.exists();
        
        File arc = new File (fileName);
        boolean arcExists = arc.exists();
        
        if (isAbso && dirExists){
        
            if (arcExists){
            
                arc.createNewFile();
            }else{
            
                System.out.println("El archivo ya existe.");
            }
        
        }else if (isAbso && !dirExists){
        
            System.out.println("El directorio no existe.");
        }else{
            System.out.println("No es una ruta absoluta.");
        }
        
    }catch(Exception e){
    
    throw new Exception(e);
    }
    }
    
    public void modoAcceso(String dirName, String fileName){
    
        File dir = new File (dirName);
        boolean isAbso = dir.isAbsolute();
        
        File arc = new File (fileName);
        boolean readable = arc.canRead();
        boolean writeable= arc.canWrite();
        
        if (isAbso){
        
            if (readable){
            
                System.out.println("Escritura si");
            }else {
                
                System.out.println("Escritura no.");
            }
            
            if(writeable){
            
                System.out.println("Lectura si.");
            }else {
            
                System.out.println("Lectura no.");
            }
        }
    
    }
    
}