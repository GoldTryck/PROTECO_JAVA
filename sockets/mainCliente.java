package sockets;
import java.io.IOException;
public class mainCliente {
    public static void main(String[] args) throws IOException{
        cliente cl = new cliente();
        System.out.println("Iniciando cliente");
        cl.startCliente();
    }
}