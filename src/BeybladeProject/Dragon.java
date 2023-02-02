package BeybladeProject;

public class Dragon extends Beyblade{

    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String isim, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(isim, donusHizi, saldiriGucu);
        this.kutsalCanavar=kutsalCanavar;
        this.gizliYetenek=gizliYetenek;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getIsim()+" "+kutsalCanavar+" ortaya çıkarıyor...");
        System.out.println(getIsim()+"'nun saldırısı: Hayalet kasırgası");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adı: "+kutsalCanavar);
        System.out.println("Gizli yetenek: "+gizliYetenek);
    }
}
