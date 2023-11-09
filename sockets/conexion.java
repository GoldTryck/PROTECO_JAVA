package sockets;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class conexion {
    private final int PUERTO = 1234; // puerto para establecer conexión
    private final String HOST = "localhost"; // host para la conexión
    protected String mensajeServidor; // Mensajes recibidos from the server
    protected DataOutputStream salidaServidor, salidaCliente; // Flujos de datos de salida
    protected ServerSocket ss; // Socket del servidor
    protected Socket cs; // Socket del cliente

    public conexion(String tipo) throws IOException {
        if (tipo.equalsIgnoreCase("servidor")) {
            ss = new ServerSocket(PUERTO);
            cs = new Socket();
        } else {
            cs = new Socket(HOST, PUERTO);
        }
    }
}
