import java.util.Scanner;

public class vucutKutleIndeksi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        double boy = sc.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        int kilo = sc.nextInt();

        double vki = kilo / (boy * boy);
        System.out.print("Vücut Kütke İndeksiniz: "+vki);
    }
}