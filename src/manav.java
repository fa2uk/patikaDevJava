import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut  =2.14;
        double elma =3.17;
        double domates =1.11;
        double muz =0.95;
        double patlican = 5.00;
        System.out.println("Armut kaç kilo");
        double armut2 = input.nextDouble();
        double armut3 = armut2*armut;
        System.out.println("Elma kaç kilo ");
        double elma2 = input.nextDouble();
        double elma3 = elma2*elma;
        System.out.println("Domates");
        double domates2 = input.nextDouble();
        double domates3 = domates2*domates;
        System.out.println("Muz");
        double muz2 = input.nextDouble();
        double muz3 = muz2*muz;
        System.out.println("Patlican");
        double patlican2 = input.nextDouble();
        double patlican3 = patlican2*patlican;
        double toplam = armut3 + elma3 + domates3 + muz3 + patlican3;

        System.out.println("Ödemeniz gereken toplam tutar "+ toplam);




    }
}
