import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler tanımlandı
        int Fizik, Kimya, Turkce, Tarih, Muzik;
        int Ortalama;
        String sonuc;

        // Scanner oluşturuldu
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Sorulduğu Zaman Notlarınızı Giriniz");

        System.out.print("Fizik Notunuz :");
        Fizik = input.nextInt();

        System.out.print("Kimya Notunuz :");
        Kimya = input.nextInt();

        System.out.print("Turkce Notunuz :");
        Turkce = input.nextInt();

        System.out.print("Tarih Notunuz :");
        Tarih = input.nextInt();

        System.out.print("Muzik Notunuz :");
        Muzik = input.nextInt();

        Ortalama = (Fizik+Kimya+Turkce+Tarih+Muzik)/5;
        System.out.println("Not Ortalamanız : " + Ortalama);

        //Koşul operatörü kullanılarak sonuc değerine atama sağlandı
        sonuc = Ortalama >= 60 ? "Geçtiniz" : "Kaldınız";
        System.out.print(sonuc);
    }
}