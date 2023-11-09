package leerArchivos;

import java.io.FileReader;
import java.io.IOException;

public class leerArchivos{
    public static void leer(){
        try{
            FileReader entrada = new FileReader("resources/archivo.txt");
            // Almacena un caracter dentro de la variable c
            int c;
            while ((c = entrada.read()) != -1) {
                System.out.println((char) c);
            }
        }catch(IOException e){
            System.out.println("Archivo no encontrado.");
        }
    }

}