import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan üç sayıyı al
        System.out.print("1. Sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("2. Sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        System.out.print("3. Sayıyı girin: ");
        int sayi3 = scanner.nextInt();

        // Sayıları if-else kullanarak küçükten büyüğe sırala
        if (sayi1 <= sayi2 && sayi1 <= sayi3) {
            if (sayi2 <= sayi3) {
                System.out.println("Küçükten büyüğe sıralama: " + sayi1 + ", " + sayi2 + ", " + sayi3);
            } else {
                System.out.println("Küçükten büyüğe sıralama: " + sayi1 + ", " + sayi3 + ", " + sayi2);
            }
        } else if (sayi2 <= sayi1 && sayi2 <= sayi3) {
            if (sayi1 <= sayi3) {
                System.out.println("Küçükten büyüğe sıralama: " + sayi2 + ", " + sayi1 + ", " + sayi3);
            } else {
                System.out.println("Küçükten büyüğe sıralama: " + sayi2 + ", " + sayi3 + ", " + sayi1);
            }
        } else {
            if (sayi1 <= sayi2) {
                System.out.println("Küçükten büyüğe sıralama: " + sayi3 + ", " + sayi1 + ", " + sayi2);
            } else {
                System.out.println("Küçükten büyüğe sıralama: " + sayi3 + ", " + sayi2 + ", " + sayi1);
            }
        }
    }
}
