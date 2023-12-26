import java.util.Scanner;

public class TaksiMetre {
    /*Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

    Taksimetre KM başına 2.20 TL tutmaktadır.
    Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    Taksimetre açılış ücreti 10 TL'dir.*/
    public static void main(String[] args) {

        double kmTutar,
                km = 0,
                sabit=2.20,
                acilisUcret=10;
        Scanner input =new Scanner(System.in);

        System.out.println("Çiçek taksiye hoşgeldiniz:");
        System.out.println("Yolcunun kaç km gittiğini giriniz:");
        km=input.nextDouble();
        kmTutar = acilisUcret+(sabit*km);

        if (kmTutar<=20){
            System.out.println("indi bindi 20 tl:");
        }else {
            System.out.println("taksi ücretniz:"+kmTutar);
        }


    }
}
