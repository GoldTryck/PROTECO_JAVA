package myScannerBuffer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ScannerBuffer{
    public static void main(String[] args){
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader teclado = new BufferedReader(isr);
            System.out.println("Ingresa una cadena: ");
            String cadena = teclado.readLine();
            System.out.println("La cadena es "+ cadena);
        }catch(Exception e){
            System.out.println("Ocurrio un problema.");
        }
    }
}