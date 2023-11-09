import java.util.ArrayList;
public class ArrayListsExample02{
    public static void main(String[] args){
        //Declaracion de un arreglo de tipo string
        ArrayList<String> lista=new ArrayList<>();

        lista.add("Manzanas");
        lista.add("Melones");
        lista.add("Cerezas");
        lista.add("Mangos");

        for(String fruta:lista){
            System.out.println(fruta);
        }
        lista.set(1,"Papayas");
        System.out.println(lista.get(1));

        lista.remove(1);
        System.out.println("Ahora tenemos: "+lista.get(1));

        int longitud = lista.size();
        System.out.println("La longitud de la lista es: "+longitud);
    }
}