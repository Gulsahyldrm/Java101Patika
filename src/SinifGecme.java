import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ders notlarını tutan bir dizi oluşturuluyor.
        int[] notlar = new int[5];

        // Kullanıcıdan ders notlarını alınıyor.
        for (int i = 0; i < 5; i++) {
            System.out.print("Lütfen " + getDersAdi(i) + " notunuzu girin (0-100): ");
            int not = scanner.nextInt();

            // Girilen notun 0 ile 100 arasında olduğunu kontrol ediyo.
            if (not < 0 || not > 100) {
                System.out.println("Hatalı giriş! Not 0 ile 100 arasında olmalıdır.");
                i--; // Hatalı giriş durumunda döngüyü bir geri alıyo.
                continue;
            }

            // Geçerli notu diziye ekliyor.
            notlar[i] = not;
        }

        // Ortalama hesaplanıyor.
        double ortalama = hesaplaOrtalama(notlar);

        // Geçme durumu kontrol ediliyor.
        if (ortalama >= 55) {
            System.out.println("Ortalama: " + ortalama + " - Sınıfı geçtiniz!");
        } else {
            System.out.println("Ortalama: " + ortalama + " - Sınıfı geçemediniz.");
        }
    }

    // Ders adlarını döndüren yardımcı bir metod.
    private static String getDersAdi(int index) {
        switch (index) {
            case 0: return "Matematik";
            case 1: return "Fizik";
            case 2: return "Turkce";
            case 3: return "Kimya";
            case 4: return "Muzik";
            default: return "";
        }
    }

    // Ortalama hesaplayan yardımcı bir metoddur.
    private static double hesaplaOrtalama(int[] notlar) {
        int toplam = 0;
        int notSayisi = 0;

        for (int not : notlar) {
            // 0 ile 100 arasındaki notları toplar.
            if (not >= 0 && not <= 100) {
                toplam += not;
                notSayisi++;
            }
        }

        // Notlar arasında geçerli not yoksa ortalama 0 olarak döndürülüyor.
        if (notSayisi == 0) {
            return 0;
        }

        return (double) toplam / notSayisi;
    }
}
