import java.util.ArrayList;
import java.util.List;

public  class ListMain {
    public static void main (String [] args){
        List<String> myList = new ArrayList<>();
        myList.add("sad");
        myList.add("seba");
        myList.add("hola");
        for(String nombre:myList){
            System.out.println(nombre);
        }
    }
}
