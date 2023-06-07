import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nr=1,rn=1,nrkomb=1,rnkomb=1,nkomb=1,rkomb=1;

        System.out.print("n sayısını giriniz :");
        int n = scanner.nextInt();
        for (int i=1;i<=n;i++){
            nr*=i;
        }

        System.out.print("r sayısını giriniz :");
        int r = scanner.nextInt();
        for (int i=1;i<=r;i++){
            rn*=i;
        }

        int farknr = n-r;
        int farkrn = r-n;

        for(int i=1;i<=farknr;i++){
            nkomb*=i;
        }
        for(int i=1;i<=farkrn;i++){
            rkomb*=i;
        }

        System.out.println("N'in r'li kombinasyonu için 1 i seçiniz\n" + "R'in n'li kombinasyonu için 2 i seçiniz" );
        int secim = scanner.nextInt();

        if(secim==1){
            nrkomb = nr/(rn*nkomb);
            System.out.println(nrkomb);
        }
        else if(secim==2){
            rnkomb = rn/(nr*rkomb);
            System.out.println(rnkomb);
        }

    }
}