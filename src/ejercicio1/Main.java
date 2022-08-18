package ejercicio1;

public class Main {
    public static void main (String[] args){
        //numbers
        byte number1= 127;
        short number2= 31212;
        int number3= 213213;
        long number4= 123213123;

        float number5= 34.34f;
        double number6=321.34d;

        // text
        char text1 = 's';
        String text2= "sadsad";

        System.out.printf("Numbers\n" +
                "byte: %s\n" +
                "short: %s\n" +
                "int: %s\n" +
                "long: %s\n" +
                "float: %sf\n" +
                "double: %sd\n" +
                "Texts\n" +
                "char: %s\n" +
                "String: %s\n",number1,number2,number3,number4,number5,number6,text1,text2);
    }
}
