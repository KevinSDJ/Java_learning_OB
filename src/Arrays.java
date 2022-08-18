public class Arrays {

    public static void main (String [] args){
        Object[] s= new Object[4];
        int[] numbers= new int[2];
        for(int i=0;i<s.length;i++){
            s[i]= new Coche();
            System.out.println(s[i]);
        }
    }
}
