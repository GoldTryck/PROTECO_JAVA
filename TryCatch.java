// Uso de try y try catch
public class TryCatch{
    public static void main(String[] args){
        int[] numeros={1,2,3,4,5,6,7,8,9};
        try{
            int value = numeros[10];

            System.out.println(value);
        }catch(IndexOutOfBoundsException e){
            System.out.println("No tiene los elementos ncecesarios");
        }finally{
            System.out.println("bye.");
        }
    }
}