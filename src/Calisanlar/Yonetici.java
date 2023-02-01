package Calisanlar;

public class Yonetici extends Calisan{
    private String sorumluKisiSayisi;

    public Yonetici(String isim, String soyisim, int id, String sorumluKisiSayisi) {
        super(isim, soyisim, id);
        this.sorumluKisiSayisi=sorumluKisiSayisi;
    }

    @Override
    public String toString() {
        return super.toString()+" sorumlu kişi sayısı="+sorumluKisiSayisi;
    }

    public void zamYap(int miktar){
        System.out.println(getIsim()+" çalışanlara "+miktar+"tl kadar zam yaptı.");
    }
}
