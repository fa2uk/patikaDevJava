import java.util.Scanner;

public class Ana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out.println("Kenar uzunlugunu giriniz");
        a = input.nextInt();
        System.out.println("Kenar uzunlugunu giriniz");
        b = input.nextInt();
        c = Math.sqrt(a*a + b*b );
        System.out.println("Hipotenüs : " + c);

    }
}
