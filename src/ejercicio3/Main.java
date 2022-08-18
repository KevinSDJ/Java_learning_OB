package ejercicio3;

public class Main {
    public static void main (String[] args){
        String[] array= {"uno","dos","tres","cuatro"};
        String result = concattext(array);
        System.out.println(result);
    }
    public static String concattext(String[] args){
        String n="";
        for (String s:args){
            n+=s+"-";
        }
        return n;
    }
}
