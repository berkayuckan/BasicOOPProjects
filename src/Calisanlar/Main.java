package Calisanlar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanStr=new Scanner(System.in);
        Scanner scanInt=new Scanner(System.in);
        System.out.println("Çalışanlar programına hoş geldiniz...");
        System.out.println("*******************************");
        System.out.println("İşlemler...\n"
                          +"1. Yazılımcı işlemleri\n"
                          +"2. Yönetici işlemleri\n"
                          +"3. Çıkış");
        System.out.println("*******************************");


        while (true){
            System.out.println("İşleminizi seçiniz");
            int islem= scanInt.nextInt();
            Outer:
            switch (islem){
                case 1:
                    Yazilimci yazilimci=new Yazilimci("Berkay","Üçkan",455,"Java,Kotlin");
                    System.out.println("Yazılımcı işlemleri:...\n"
                            +"1. Format at\n"
                            +"2. Bilgileri göster\n"
                            +"3. Çıkış");
                    while (true){
                        System.out.println("İşlem seçiniz...");
                        int num= scanInt.nextInt();
                        switch (num){
                            case 1:
                                System.out.println("İşletim sistemi: ");
                                String isletimSistemi= scanStr.nextLine();
                                yazilimci.formatAt(isletimSistemi);
                                break;
                            case 2:
                                System.out.println(yazilimci.toString());
                                break;
                            case 3:
                                System.out.println("Yazılımcı işlemlerinde çıkılıyor...");
                                break Outer;
                            default:
                                System.out.println("Yanlış işlem lütfen tekrar deneyiniz...");
                                break;
                        }
                    }
                case 2:
                    Yonetici yonetici=new Yonetici("Tuğkan","Özeri",589,"10");
                    System.out.println("Yönetici işlemleri:...\n"
                            +"1. Zam yap\n"
                            +"2. Bilgileri göster\n"
                            +"3. Çıkış");
                    while (true){
                        System.out.println("İşlem seçiniz...");
                        int no= scanInt.nextInt();
                        switch (no){
                            case 1:
                                System.out.println("Ne kadar zam yapılsın?");
                                int miktar= scanInt.nextInt();
                                yonetici.zamYap(miktar);
                                break;
                            case 2:
                                System.out.println(yonetici.toString());
                                break;
                            case 3:
                                System.out.println("Yönetici işlemlerinde çıkılıyor...");
                                break Outer;
                            default:
                                System.out.println("Yanlış işlem lütfen tekrar deneyiniz...");
                                break;
                        }

                    }
                case 3:
                    System.out.println("Program sonlandırılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Yanlış işlem lütfen tekrar deneyiniz...");
                    break;
            }

        }

    }
}
