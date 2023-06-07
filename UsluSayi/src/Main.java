import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int us,sayi;

        System.out.print("Üssü alınacak sayiyi giriniz : ");
        sayi = scanner.nextInt();

        System.out.print("Üs giriniz : ");
        us = scanner.nextInt();

        for(int i=1;i<=us-1;i++){
            sayi*=sayi;
        }

        System.out.println("Sonuç : " + sayi);
    }
}