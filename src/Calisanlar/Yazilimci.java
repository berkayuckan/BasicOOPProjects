package Calisanlar;

public class Yazilimci extends Calisan{

    private String diller;

    public Yazilimci(String isim, String soyisim, int id, String diller) {
        super(isim, soyisim, id);
        this.diller=diller;
    }

    public void formatAt(String isletimSistemi){
        System.out.println(getIsim()+" "+isletimSistemi+" işletim sistemini yüklüyor...");
    }

    @Override
    public String toString() {
        return super.toString()+" diller="+diller;
    }
}
