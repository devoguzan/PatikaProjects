import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Üs değerini giriniz : ");
        int us = scan.nextInt();

        System.out.print("Taban değerini giriniz : ");
        int taban = scan.nextInt();

        int sonuc = 1;

        for(int i=1;i<=us;i++){
            sonuc *=taban;
        }
        System.out.print("Sonuç : " + sonuc);
    }
}