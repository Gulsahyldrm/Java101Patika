import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        int kenar1, kenar2,hipotenus;
        Scanner input =new Scanner(System.in);
        System.out.println("birinci kenar giriniz:");
        kenar1=input.nextInt();
        System.out.println("ikinci kenar giriniz:");
        kenar2=input.nextInt();
        hipotenus= (kenar1*kenar1)+(kenar2*kenar2);
        System.out.println("bu üçgenin hpotenüsü:"+Math.sqrt(hipotenus));
  }
}



