package sockets;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class servidor extends conexion{
    public servidor() throws IOException{
        super("servidor");
    }

    public void startServidor(){
        try{
            System.out.println("Esperando...");
            cs = ss.accept();
            System.out.println("Cliente en linea");
            salidaCliente = new DataOutputStream(cs.getOutputStream());
            salidaCliente.writeUTF("Peticion recibida y aceptada");
            BufferedReader entrada = new BufferedReader(new InputStreamReader(cs.getInputStream()));
            while((mensajeServidor = entrada.readLine()) != null){
                System.out.println(mensajeServidor);
            }
            System.out.println("Fin de la conexion");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}

