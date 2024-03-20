public class Urun {
    String barkodNo;
    String ad;

    public Urun(String barkodNo, String ad) {
        this.barkodNo = barkodNo;
        this.ad = ad;
    }
    public static Urun findUrunByBarkodNo(Kategori kategori, String barkodNo) {
        Node current = kategori.getHead();
        while (current != null) {
            if (current.urun.getBarkodNo().equals(barkodNo)) {
                return current.urun;
            }
            current = current.getNext();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Barkod No: " + barkodNo + ", Ürün Adı: " + ad;
    }

    public String getBarkodNo() {
        return barkodNo;
    }

    public void setBarkodNo(String barkodNo) {
        this.barkodNo = barkodNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}