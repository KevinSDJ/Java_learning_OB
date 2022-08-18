import java.util.HashMap;
import java.util.Map;

public class MapList {
    public static void main(String[] args){
        Map<String,String> b = new HashMap<>();
        b.put("123sd","seba");

        for(Map.Entry<String,String> va:b.entrySet()){
            System.out.println(va);
        }
    }
}
