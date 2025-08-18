import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kenar uzunluğu");
        double kenar1 = input.nextDouble();
        System.out.println("Kenar uzunluğu");
        double kenar2 = input.nextDouble();
        System.out.println("Kenar uzunluğu");
        double kenar3 = input.nextDouble();
        double cevre = kenar1 + kenar2 + kenar3;
        System.out.println("Çevre " + cevre);
        double u ;

        u = (kenar1 + kenar2 + kenar3) / 2;
        double alanx2;
        alanx2 = Math.sqrt (u*(u-kenar1)*(u-kenar2)*(u-kenar3)) ;
        double alanx = alanx2/2;
        System.out.println("Alan " + alanx );






    }
}
