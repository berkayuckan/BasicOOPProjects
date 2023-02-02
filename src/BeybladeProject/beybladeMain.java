package BeybladeProject;

import java.util.Scanner;

public class beybladeMain {
    public static void main(String[] args) {

        Scanner scanStr=new Scanner(System.in);

        System.out.println("Beyblade programına hoş geldiniz...");
        System.out.println("Çıkış için \"q\" veya \"Q\" ya basınız...");

        while (true){
            System.out.println("Hangi beyblade'i üretmek istiyorsunuz?");
            String islem=scanStr.nextLine();
            if (islem.equalsIgnoreCase("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else {
                BeybladeFabrikasi fabrika=new BeybladeFabrikasi();
                Beyblade beyblade=fabrika.beybladeUret(islem);

                if (beyblade==null){
                    System.out.println("Lütfen geçerli bir beyblade ismi giriniz.");
                }
                else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }

        }





    }
}
