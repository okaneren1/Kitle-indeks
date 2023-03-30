package ders1;
import java.util.Scanner;

public class endeks {
    public static void main(String[] args) {
        double kilo,boy,kitle;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu(metre cinsinde)giriniz:");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz:");
        kilo = input.nextDouble();
        kitle = kilo/ boy*boy;
        System.out.print("Vücut Kitle İndeksiniz:"+kitle);
    }
}
