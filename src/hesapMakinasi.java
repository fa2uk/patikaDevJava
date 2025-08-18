import java.util.Scanner;
public class hesapMakinasi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Birinci sayıyı giriniz");
        Double a = input.nextDouble();
        System.out.println("İkinci sayıyı giriniz");
        Double b = input.nextDouble();

        System.out.println("Yapmak istediginiz işlemi seçin");

        System.out.println("1.Toplama");
        int toplama = 1;
        System.out.println("2.Çıkarma");
        int cikarma = 2;
        System.out.println("3.Çarpma");
        int carpma = 3;
        System.out.println("4.Bölme");
        int bolme = 4;
        int hesap = input.nextInt();

        if (hesap == 1){
            System.out.println(a+b);
        }
        else if (hesap == 2){
            System.out.println(a-b);
        }
        else if (hesap == 3){
            System.out.println(a*b);
        }
        else if (hesap == 4) {
        if (a == 0 ) {
            System.out.println("0 a bölünmez ");


            }
        else if (b == 0 ) {
            System.out.println("0 a bölünmez");
        }
        else
            System.out.println(a/b);
        }






    }
}
