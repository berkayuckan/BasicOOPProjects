package AtmProje;

import java.util.Scanner;

public class ATM {

    public void calis(Hesap hesap){

        Login login=new Login();
        Scanner scan=new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz");
        System.out.println("*************************");
        System.out.println("Kullanıcı girişi");
        System.out.println("*************************");

        int girisHakki=3;
        while (true){

            if (login.login(hesap)){
                System.out.println("Giriş başarılı...");
                break;
            }
            else {
                System.out.println("Giriş başarısız...");
                girisHakki--;
                System.out.println("Kalan giriş hakkı: "+girisHakki);
            }
            if (girisHakki==0){
                System.out.println("Giriş hakkınız bitmiştir...");

                return;
            }

        }

        System.out.println("**************************");
        System.out.println("1. Bakiye görüntüle\n"
                           +"2. Para Yatırma\n"
                           +"3. Para Çekme\n"
                           +"4. Çıkış");
        System.out.println("**************************");

        while (true){
            System.out.println("İşlem seçiniz");
            int secim= scan.nextInt();
            switch (secim){
                case 1:
                    System.out.println("Bakiyeniz: "+hesap.getBakiye());
                    break;
                case 2:
                    System.out.println("Yatırmak istediğiniz tutar: ");
                    int add= scan.nextInt();
                    hesap.paraYatir(add);
                    break;
                case 3:
                    System.out.println("Çekmek istediğinz tutar: ");
                    int withdraw= scan.nextInt();
                    hesap.paraCek(withdraw);
                    break;
                case 4:
                    System.out.println("Programdan çıkılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz işlem...");
                    break;
            }

        }
    }

}
