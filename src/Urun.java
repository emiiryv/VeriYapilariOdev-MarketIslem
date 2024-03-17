public class Urun {
    String barkodNo;
    String ad;

    public Urun(String barkodNo, String ad) {
        this.barkodNo = barkodNo;
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "Barkod No: " + barkodNo + ", Ürün Adı: " + ad;
    }
}