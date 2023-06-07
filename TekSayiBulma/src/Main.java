import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayi;
        do {
            System.out.print("Tek sayi giriniz :");
            sayi = scanner.nextInt();

            if(sayi%2==0 && sayi%4 == 0){
                toplam+=sayi;
            }
        } while (sayi%2==0);

        System.out.println("Toplamları = " + toplam);
    }
}