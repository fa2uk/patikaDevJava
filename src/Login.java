import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user ="admin";
        String pass ="admin";
        String newPass;
        System.out.println("KUllanıcı adınızı giriniz");
        user=input.nextLine();
        System.out.println("Şİfrenizi giriniz");
        pass=input.nextLine();
        if(user.equals("admin") && pass.equals("admin")){
            System.out.println("Sisteme başarıyla giriş yaptınız");
        } else{
            System.out.println("Giriş başarısız eğer şifrenizi değiştirmek için 1 e sistemden çıkmak için 2 ye basın ");
            int secenek = input.nextInt();
            if (secenek == 1) {
                System.out.println("Oluşturmak istediginiz şifreyi giriniz");
                newPass = input.nextLine();
                if (newPass.equals("admin")) {
                    System.out.println("şifre oluşturulamadı");
                } else {
                    System.out.println("Şifreniz başarıyla oluştu");
                    
                }

            }
            }
    }
}
