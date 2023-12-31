package filesEjemplo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class files{
    public static void main(String[] args) throws IOException{
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new FileInputStream("resources/saludo.txt");
            out = new FileOutputStream("resources/adios.txt");

            int c;
            while((c=in.read()) != -1){
                out.write(c);
            }
        }
        finally{
            if(in != null) {
                in.close();
            }
            if(out != null){
                out.close();
            }
        }
    }
}