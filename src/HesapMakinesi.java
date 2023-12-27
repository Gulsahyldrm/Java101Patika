import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        int sayi1,sayi2,select, sonuc;
        Scanner input =new Scanner(System.in);
        System.out.println("ilk sayıyı cgiriniz:");
        sayi1=input.nextInt();
        System.out.println("ikinci sayıyı giriniz:");
        sayi2=input.nextInt();
        System.out.println("yapmak istediğiniz işlemi seçin\n1-Toplama\n2-Çıkartma\n3-Çarpma\n3-Bölme");
        select=input.nextInt();

        switch (select){
            case 1:
                sonuc=sayi1+sayi2;
                System.out.println("Toplama"+sonuc);
                break;
            case 2:
                sonuc=sayi1-sayi2;
                System.out.println("Çıkartma"+sonuc);
                break;
            case 3:
                sonuc=sayi1*sayi2;
                System.out.println("Çarpma"+sonuc);
                break;
            case 4:
                sonuc=sayi1/sayi2;
                System.out.println("Bölme"+sonuc);
                break;
            default:
                // Value is invalid
                break;

        }
    }
}
