package YurtDisiCikis;

import java.util.Scanner;

public class Yolcu implements IYurtDisiKurallari{
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu(){

        Scanner scanInt=new Scanner(System.in);
        Scanner scanStr=new Scanner(System.in);
        System.out.print("Yatırdığınız harç bedeli= ");
        this.harc= scanInt.nextInt();
        System.out.print("Herhangi bir siyasi yasağınız bulunuyor mu? ");
        String cevap=scanStr.nextLine();
        if (cevap.equalsIgnoreCase("evet")){
            this.siyasiYasak=true;
        }
        else {
            this.siyasiYasak=false;
        }

        System.out.print("Vizeniz bulunuyor mu? ");
        String cevap2= scanStr.nextLine();
        if (cevap2.equalsIgnoreCase("evet")){
            this.vizeDurumu=true;
        }
        else {
            this.vizeDurumu=false;
        }


    }

    @Override
    public boolean cikisHarciKontrol() {
        if (this.harc<300){
            System.out.println("Lütfen çıkış harcını tam yatırınız...");
            return false;
        }
        else if (this.harc>300) {
            System.out.println("İşlem tamam! Para üstünüzü alınız.");
            System.out.println("Para üstü= "+(harc-300)+"TL");
            return true;
        }
        else {
            System.out.println("İşlem tamam!");
            return true;
        }

    }

    @Override
    public boolean siyasiYasakKontrol() {
        if (this.siyasiYasak==true){
            System.out.println("Siyasi yasağınız bulunuyor. Yurt dışına çıkamazsınız!");
            return false;
        }
        else {
            System.out.println("Siyasi yasağınız bulunmuyor!");
            return true;
        }

    }

    @Override
    public boolean vizeDurumuKontrol() {
        if (this.vizeDurumu==true){
            System.out.println("Vize işlemleri tamamdır!");
            return true;
        }
        else {
            System.out.println("Vizeniz bulunmamaktadır!");
            return false;
        }

    }
}
