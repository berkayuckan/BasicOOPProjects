package YurtDisiCikis;

public class Main {
    public static void main(String[] args) {

        System.out.println("Atatürk Havalimanına Hoş geldiniz...");

        while (true){

            System.out.println("***************************");
            mesaj();
            System.out.println("***************************");
            sartlar();

            Yolcu yolcu=new Yolcu();
            System.out.println("Harç bedeli kontrol ediliyor...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (yolcu.cikisHarciKontrol()==false){
                mesaj();
                continue;
            }
            System.out.println("Siyasi yasak kontrol ediliyor...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (yolcu.siyasiYasakKontrol()==false){
                mesaj();
                continue;
            }
            System.out.println("Vize durumu kontrol ediliyor...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (yolcu.vizeDurumuKontrol()==false){
                mesaj();
                continue;
            }

            System.out.println("İşlemleriniz tamam, yurtdışına çıkabilirsiniz!");
            break;

        }

    }

    public static void sartlar(){
        System.out.println("Yurtdışı çıkış kuralları...\n"
                +"Herhangi bir siyasi yasağınızın bulunmaması gerekiyor!\n"
                +"300 TL harç bedelinizi tam olarak yatırmanız gerekiyor!\n"
                +"Vizenizin bulunması gerekiyor!");
    }

    public static void mesaj(){
        System.out.println("Yurtdışı şartlarından hepsini sağlamanız gerekiyor!");
    }
}
