import java.util.Scanner;
public class OrtalamaHesaplama {
    public static void main(String[] args) {

        int mat,fizik, kimya, türkçe, tarih, müzik;

        Scanner puan =new Scanner(System.in);

        System.out.println("Lütfen Matematik notunu giriniz:");
        mat = puan.nextInt();
        System.out.println("Lütfen fizik notunu giriniz:");
        fizik = puan.nextInt();
        System.out.println("Lütfen kimya notunu giriniz:");
        kimya = puan.nextInt();
        System.out.println("Lütfen türkçe notunu giriniz:");
        türkçe = puan.nextInt();
        System.out.println("Lütfen tarih notunu giriniz:");
        tarih = puan.nextInt();
        System.out.println("Lütfen müzik notunu giriniz:");
        müzik = puan.nextInt();

        double ort;
        ort= (mat+fizik+kimya+türkçe+tarih+müzik)/6;
        System.out.println("not ortalamanız:"+ort );

    }
}