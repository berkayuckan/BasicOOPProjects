package BeybladeProject;

public class Dranza extends Beyblade{

    private String kutsalCanavar;


    public Dranza(String isim, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(isim, donusHizi, saldiriGucu);
        this.kutsalCanavar=kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getIsim()+" "+kutsalCanavar+" ortaya çıkarıyor...");
        System.out.println(getIsim()+"'nin saldırısı: Alev kılıcı");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adı: "+kutsalCanavar);
    }
}
