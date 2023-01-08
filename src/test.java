import java.util.Scanner;
    public class test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Matematik, Fizik, Kimya, Turkce, Tarih, Muzik;
        System.out.println("Matematik notunuzu giriniz");
        Matematik= input.nextInt();
        System.out.println("Fizik notunuzu giriniz");
        Fizik= input.nextInt();
        System.out.println("kimya notunuzu giriniz");
        Kimya= input.nextInt();
        System.out.println("Türkçe notunuzu giriniz");
        Turkce= input.nextInt();
        System.out.println("Tarih notunuzu giriniz");
        Tarih= input.nextInt();
        System.out.println("Müzik notunuzu giriniz");
        Muzik= input.nextInt();



        int topla=(Matematik+Fizik+Kimya+Tarih+Turkce+Muzik);
        double sonuc=topla/6.0;

        System.out.println(sonuc);
    }

}
