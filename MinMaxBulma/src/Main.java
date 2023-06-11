
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numCount = 1;
        do {
            if(numCount <= 0) System.out.println("Geçersiz sayı girdiniz.");

            System.out.print("Kaç adet sayı gireceksiniz : ");
            numCount = input.nextInt();
        }while(numCount < 0);

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for(int i = 0; i < numCount; i++)
        {
            System.out.print("Sayı girin : ");
            int currentNum = input.nextInt();
            if(currentNum > maxNum) maxNum = currentNum;
            if(currentNum < minNum) minNum = currentNum;
        }

        System.out.println("Max sayı : " + maxNum + "\nMin sayı : " + minNum);
    }
}