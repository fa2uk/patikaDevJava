import  java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Kullanici;
        System.out.println("kullanici");
        Kullanici = input.nextLine();
        String sifre;
        System.out.println("sifre");
        sifre = input.nextLine();
        if(Kullanici.equals("admin") && sifre.equals("admin")){
            System.out.println("Başarıyla giriş yaptınız");
        }
        else{
            System.out.println("Yanlış giriş");
        }

    }
}
