import java.util.Scanner;
public class cift {
    public static void main(String[] args) {
        System.out.println("Sayı gir");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        for (int i = 1 ; i<=sayi ; i++ ){
            if (i%2==0){
                System.out.println(i);
            }
        }



    }
}
