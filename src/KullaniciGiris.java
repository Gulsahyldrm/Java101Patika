import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String admin= "nur";
        String password= "1234";
        String kullaniciAd,sifre;
        int secim;
        Scanner input =new Scanner(System.in);
        System.out.println("kullanıcı adını giriniz:");
        kullaniciAd=input.nextLine();
        System.out.println("şifre giriniz:");
        sifre=input.nextLine();

        if (kullaniciAd.equals(admin) && sifre.equals(password)){
            System.out.println("Hoş Geldiniz");
        } else if (kullaniciAd.isEmpty()&&sifre.isEmpty()) {
            System.out.println("kullanıcı adını veya şifreyi giriniz");
        } else if (kullaniciAd.equals(admin) && !sifre.equals(password)) {
            System.out.println("şifreniz yanlış! \nyeni şifre oluşturmak ister misiniz?\n 1-Evet\n2-Hayır");
            secim=input.nextInt();
            switch (secim){
                case 1:
                    while (true){
                        Scanner newInput =new Scanner(System.in);
                        System.out.println("yeni şifrenizi giriniz:");
                        String newSifre=newInput.nextLine();
                        if (!newSifre.equals(password) && !newSifre.equals(password)) {
                            password = newSifre;
                            System.out.println("Şifre oluşturuldu");
                            break;
                        } else
                            System.out.println("Şifre oluşturulamadı. Lütfen başka şifre giriniz.");
                    }
                    break;
                case 2:
                    System.out.println("şifrenizi tekrar giriniz");
                    break;
        }

        }else System.out.println("kullanıcı adınız yanlış");
    }
}
