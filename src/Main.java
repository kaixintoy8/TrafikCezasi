import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen hızınızı giriniz: ");
        int hiz= scanner.nextInt();
        int CezaKodu=0;

        if (hiz>=130){
            System.out.println("Ehliyetinize el konuldu.");
        } else if (110<=hiz && hiz<130 ) {
            CezaKodu=2;
        } else if (90<= hiz && hiz<110) {
            CezaKodu=1;
        }

        switch (CezaKodu){
            case 2:
                System.out.println("Cezanız 2000TL! ");
                break;
            case 1:
                System.out.println("Cezanız 1000TL!");
                break;
            default:
                System.out.println("Hız sınırına uygunsunuz! ");
                break;
        }
        scanner.close();
    }
}