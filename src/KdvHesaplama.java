import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {

        double fiyat;
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen fiyat giriniz:");
         fiyat=input.nextDouble();


        double kdv1 = 0.18;
        double kdv2 = 0.08;


        if ( fiyat<= 1000 ){
            double fiyat2 = fiyat*kdv1;
            System.out.println("KDV tutarınız:"+fiyat2);
           double sonFiyat= fiyat+fiyat2;
            System.out.println("KDV'li Fiyat:"+sonFiyat);
        } else {
           double tutar = fiyat*kdv2;
            System.out.println("KDV tutarınız:"+tutar);
            double sonFiyat2=fiyat+tutar;
            System.out.println("KDV'li Fiyat:"+sonFiyat2);
        }


    }
}
