package AtmProje;

import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap){
        Scanner scan=new Scanner(System.in);
        String kullaniciAdi;
        String parola;

        System.out.println("Kullanıcı adı: ");
        kullaniciAdi= scan.nextLine();
        System.out.println("Parola: ");
        parola= scan.nextLine();

        if (hesap.getKullaniciAdi().equals(kullaniciAdi) && (hesap.getParola().equals(parola))){
            return true;
        }
        else {
            return false;
        }

    }
}
