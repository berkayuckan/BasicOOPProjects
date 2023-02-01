package Calisanlar;

public class Calisan {

    private String isim;
    private String soyisim;
    private int id;

    public Calisan(String isim, String soyisim, int id) {
        setIsim(isim);
        setSoyisim(soyisim);
        setId(id);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", id=" + id +
                '}';
    }


}
