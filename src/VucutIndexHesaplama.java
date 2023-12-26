import java.util.Scanner;

public class VucutIndexHesaplama {
    public static void main(String[] args) {
        int kg;
        Scanner input =new Scanner(System.in);
        System.out.println(" Lütfen kilonuzu giriniz :");
        kg=input.nextInt();
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        double m=input.nextDouble();
        double index=  kg/(m*m);
        System.out.println("Vücut Kitle İndeksiniz :"+index);

    }
}
