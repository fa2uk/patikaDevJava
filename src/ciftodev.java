import java.util.Scanner;
public class ciftodev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 0;
        int adet = 0;
        System.out.println("Sayı giriniz");
        int sayi = input.nextInt();
        System.out.println("3 ve 4 ile bölünebilen sayılar");
        for (int  k=1;k<=sayi;k++){
            if(k%3==0){
                System.out.println(k);

                } else if (k%4==0){
                System.out.println(k);
                toplam +=k;
                adet++;

            }
            }
        System.out.println(toplam/adet +" Ortalama");
        }
        }


