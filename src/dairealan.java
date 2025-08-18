import java.util.Scanner;
public class dairealan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Dairenin yarı çapını giriniz");
        double r = input.nextDouble();
        double alan = pi*r*r;
        System.out.println("Dairenin alanı " + alan);
        double cevre = 2*pi*r;
        System.out.println("Dairenin çevresi " + cevre);



    }
}
