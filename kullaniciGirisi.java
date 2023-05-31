import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        String userName, passwords;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Girişi: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        passwords = input.nextLine();

        // line burada string metotlar için kullanılan terim.

        if(userName.equals("patika") && passwords.equals("java123")){
            System.out.println("Girişiniz Başarılı :) ");
          //equals komutu string metotlarda eşit mi? anlamını taşır.
        }else{
            System.out.println("Başarısız Giriş Yaptınız! Tekrar Deneyin");
        }
    }
}
