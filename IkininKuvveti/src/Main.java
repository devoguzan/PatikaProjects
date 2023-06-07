import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz : ");
        int sayi = scanner.nextInt();

        for(int i=1;i<=sayi;i*=4){
            System.out.println(i);
        }
        for(int i=1;i<=sayi;i*=5){
            System.out.println(i);
        }
    }
}