package sockets;
import java.io.IOException;
public class mainServidor {
    public static void main(String[] args) throws IOException{
        servidor sv = new servidor();
        System.out.println("Iniciando servidor");
        sv.startServidor();
    }
}