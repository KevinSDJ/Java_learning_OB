public class CocheMain {
    public static void main (String[] args){
        String coche ="alfa romeo";
        Coche miobjetocoche1= new Coche("red","vw","roster",12.3,10.4,90);
        miobjetocoche1.acelerar(100);
        System.out.println(miobjetocoche1);
        CocheElectrico micocheelectrico1= new CocheElectrico("tesla","red","tesla","v",20.2,1.3,10);
        System.out.println(micocheelectrico1);
    }
}
