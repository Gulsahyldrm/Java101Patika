


public class ArtikYil {


    public static boolean leapYear(int year){
        boolean sonuc;
        if(year %4 == 0){
            sonuc = true;
        } else {
            sonuc= false;
        }
        return sonuc ;
    }

    public static void main(String[] args) {
        System.out.println(leapYear(2021));
    }
}