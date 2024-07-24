package HipotenusHesaplama;

import java.util.Scanner;

public class App {

    /*
     * Dik Üçgende Hipotenüs Bulan Program
     * Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü
     * hesaplayan programı yazın.
     * 
     * Ödev
     * Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan
     * programı yazınız.
     * 
     * Formül
     * Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
     * 
     * 𝑢 = (a+b+c) / 2
     * 
     * Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
     */
    public static void main(String[] args) {

        hipotenusBul();
        alanBul();

    }

    public static void hipotenusBul() {
        Scanner sc = new Scanner(System.in);
        System.out.println("kenar1 gir: ");
        float kenar1 = sc.nextFloat();
        System.out.println("kenar2 gir: ");
        float kenar2 = sc.nextFloat();
        double hipotenus = Math.sqrt(((kenar1 * kenar1) + (kenar2 * kenar2)));
        System.out.println("hipotenus kenarı: " + hipotenus);
        // sc.close();
    }

    public static void alanBul() {

        Scanner sc = new Scanner(System.in);
        System.out.println("kenar1 gir: ");
        float kenar1 = sc.nextFloat();
        System.out.println("kenar2 gir: ");
        float kenar2 = sc.nextFloat();
        System.out.println("kenar3 gir: ");
        float kenar3 = sc.nextFloat();
        float u = (kenar1 + kenar2 + kenar3) / 2;
        float deger = u * (u - kenar1) * (u - kenar2) * (u - kenar3);

        double Alan = Math.sqrt(deger);
        System.out.println("değerleri girilen üçgenin alanı: " + Alan);
        sc.close();
    }
}
