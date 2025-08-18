import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double kmFiyat = 2.20;
        double acilisfiyat = 10;
        System.out.println("Yaptıgınız km:");
        double Km = input.nextDouble();
        double toplam = kmFiyat * Km + 10;
        toplam = (toplam <20) ? 20 : toplam;


        System.out.println("Ödemeniz gereken miktar"+ toplam);




    }
}
