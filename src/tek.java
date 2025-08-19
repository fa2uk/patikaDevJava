import java.util.Scanner;
public class tek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayac = 0;
        int a = input.nextInt();

        if  (a<0){
            System.out.println("Negatif sayı girdiniz işlem sonlandı");
        }else{
            while (true){
                System.out.println("Bir sayı giriniz");
                int b = input.nextInt();
                if (b<0){
                    System.out.println("Negatif sayı girdiniz işlem sonlandırıldı");
                    break;
                }
                sayac += b;
                System.out.println(sayac);


            }


        }
    }
}
