package AtmProje;

public class AtmMain {
    public static void main(String[] args) {

        ATM atm=new ATM();
        Hesap hesap=new Hesap("Elden","123456",5000);

        atm.calis(hesap);
        System.out.println("Programdan çıkılıyor...");


    }
}
