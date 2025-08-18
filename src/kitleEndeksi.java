import java.util.Scanner;
public class kitleEndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuz");
        double boy = input.nextDouble();
        System.out.println("Kilonuz" );
        double Kilo = input.nextDouble();
        double endeks;
        endeks = Kilo/ (boy*boy);
        System.out.println(endeks);
    }
}
