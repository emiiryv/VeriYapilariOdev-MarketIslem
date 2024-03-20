class Kategori {
    String ad;
    Node head;
    int urunSayisi;

    public Kategori(String ad) {
        this.ad = ad;
        this.head = null;
        this.urunSayisi = 0;
    }

    public void urunEkle(Urun urun) {
        Node newNode = new Node(urun);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        urunSayisi++;
    }

    public void urunSil(Urun urun) {
        if (head == null) {
            System.out.println("Kategori boş.");
            return;
        }

        if (head.urun.barkodNo.equals(urun.barkodNo)) {
            head = head.next;
            urunSayisi--;
            return;
        }

        Node temp = head;
        Node prev = null;
        while (temp != null && !temp.urun.barkodNo.equals(urun.barkodNo)) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Ürün bulunamadı.");
            return;
        }

        prev.next = temp.next;
        urunSayisi--;
    }
    public void urunGuncelle(String barkodNo, String yeniAd) {
        Node current = head;
        while (current != null) {
            if (current.urun.getBarkodNo().equals(barkodNo)) {
                current.urun.setAd(yeniAd);
                System.out.println("Ürün başarıyla güncellendi.");
                return;
            }
            current = current.getNext();
        }
        System.out.println("Belirtilen barkod numarasına sahip bir ürün bulunamadı.");
    }

    public void urunleriListele() {
        Node current = head;
        while (current != null) {
            System.out.println(current.urun);
            current = current.next;
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Kategori: ").append(ad).append("\n");
        Node temp = head;
        while (temp != null) {
            sb.append(temp.urun.toString()).append("\n");
            temp = temp.next;
        }
        return sb.toString();
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getUrunSayisi() {
        return urunSayisi;
    }

    public void setUrunSayisi(int urunSayisi) {
        this.urunSayisi = urunSayisi;
    }
}
