package sockets;
import java.io.DataOutputStream;
import java.io.IOException;

public class cliente extends conexion{
    public cliente() throws IOException{
        super("cliente");
    }
    public void startCliente(){
        try{
            salidaServidor = new DataOutputStream(cs.getOutputStream());
            for(int i = 0; i < 2; i++){
                salidaServidor.writeUTF("Este es el mensaje No."+ i+1 + "\n");
            }
            cs.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
