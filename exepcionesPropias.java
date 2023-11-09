import java.util.ArrayList;
import java.util.Scanner;

public class exepcionesPropias{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Ingresa tu edad: ");
            int edad = scanner.nextInt();

            if(edad < 0){
                throw new EdadInvalidException("La edad ingresada es negativa.");
            }
            if(edad >= 0 & edad<= 17){
                throw new MenorEdadException("Eres menor de edad");
            }

            System.out.println("la edad ingresada es: "+ edad);
        }catch(EdadInvalidException e){
            System.out.println("Error "+ e.getMessage());
        }catch(MenorEdadException e1){
            System.out.println("Error "+ e1.getMessage());
        }catch(Exception e){
            System.out.println("Error inesperado: "+ e.getMessage());
            System.out.println("Se ha producido un error de tipo: "+ e.getClass().getName());
        }
    }

    public static class EdadInvalidException extends Exception{
        public EdadInvalidException(String mensaje){
            super(mensaje);
        }
    }
    public static class MenorEdadException extends Exception{
        public MenorEdadException(String mensaje){
            super(mensaje);
        }
    }
}