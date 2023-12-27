import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        int heat;
        Scanner input =new Scanner(System.in);
        System.out.println("sıcaklık giriniz:");
        heat=input.nextInt();

        if (heat>5){
            if (heat>25){
                System.out.println("yüzmeye gidebilirsiniz");
            }else if (heat>15){
                System.out.println("pikniğe gidebilirsiniz");
            } else System.out.println("sinemaya gidebilirsiniz");
        }else System.out.println("kayak yapabilirsiniz.");
    }
}
