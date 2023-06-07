import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toplam=0,sayac=0;
        int ortalama;

        System.out.print("Hangi sayıya kadar : ");
        int sayi = scanner.nextInt();

        for(int i=0;i<=sayi;i++){
            if(i==0)
                continue;
            if(i%3==0 && i%4==0){
                toplam+=i;
                sayac++;
            }
        }
        ortalama = toplam/sayac;
        System.out.println("Ortalamaları = " + ortalama);
    }
}