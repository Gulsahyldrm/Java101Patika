import java.util.Scanner;

public class DaireHesaplama {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        Scanner input =new Scanner(System.in);
        System.out.println("dairenin yarı çapını giriniz:");
        r= input.nextInt();
        double cevre=  2 * pi * r;
        double alan =  pi * r * r;
        System.out.println("dairenin çevres:" +cevre);
        System.out.println("dairenin alanı:" +alan);

    }
}
