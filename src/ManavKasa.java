import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double fiyat;
        int kgA,kgE,kgD,kgM,kgP;
        double  A= 2.14,
                E= 3.67 ,
                D= 1.11,
                M= 0.95,
                P= 5;
        Scanner input =new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? :");
        kgA=input.nextInt();
        System.out.println("Elma Kaç Kilo ? :");
        kgE=input.nextInt();
        System.out.println("Domates Kaç Kilo ?:");
        kgD=input.nextInt();
        System.out.println("Muz Kaç Kilo ? :");
        kgM=input.nextInt();
        System.out.println("Patlıcan Kaç Kilo ? :");
        kgP=input.nextInt();

        fiyat=(kgA*A)+(kgE*E)+(kgD*D)+(kgM*M)+(kgP*P);

        System.out.println("Toplam Tutar:"+fiyat);



    }
}
