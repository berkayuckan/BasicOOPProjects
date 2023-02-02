package BeybladeProject;

public class Beyblade {
    private String isim;
    private int donusHizi;
    private int saldiriGucu;

    public Beyblade(String isim, int donusHizi, int saldiriGucu) {
        setIsim(isim);
        setDonusHizi(donusHizi);
        setSaldiriGucu(saldiriGucu);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }

    public void saldir(){
        System.out.println(getIsim()+" "+saldiriGucu+" saldırı gücü ve "+donusHizi+" dönüş hızı ile saldırıyor.");
    }

    public void kutsalCanavarOrtayaCikar(){
        System.out.println("Bu beyblade'in kutsal canavarı bulunmuyor...");
    }

    public void bilgileriGoster(){
        System.out.println("Beyblade ismi:"+isim+"\n"
                           +"Saldırı gücü:"+saldiriGucu+"\n"
                           +"Dönüş hızı: "+donusHizi);
    }
}
