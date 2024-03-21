import java.util.Scanner;
import java.util.InputMismatchException;

public class Panel {

    private Stack sepet;
    Kategori gida = new Kategori("Gıda Ürünleri");
    Kategori temizlik = new Kategori("Temizlik Ürünleri");
    Kategori teknoloji = new Kategori("Teknoloji Ürünleri");

    public Panel() {
        this.sepet = new Stack();
        this.gida = gida;
        this.temizlik = temizlik;
        this.teknoloji = teknoloji;
    }
    public void marketUrunleriOlustur(){
        Urun marketUrun1 = new Urun("1","Ekmek" );
        gida.urunEkle(marketUrun1);
        Urun marketUrun2 = new Urun("2","Su");
        gida.urunEkle(marketUrun2);
        Urun marketUrun3 = new Urun("3","Pirinç");
        gida.urunEkle(marketUrun3);
        Urun marketUrun4 = new Urun("4","Domates");
        gida.urunEkle(marketUrun4);
        Urun marketUrun5 = new Urun("5","Sabun");
        temizlik.urunEkle(marketUrun5);
        Urun marketUrun6 = new Urun("6","Şampuan");
        temizlik.urunEkle(marketUrun6);
        Urun marketUrun7 = new Urun("7","Çamaşır Suyu");
        temizlik.urunEkle(marketUrun7);
        Urun marketUrun8 = new Urun("8","Pil");
        teknoloji.urunEkle(marketUrun8);
        Urun marketUrun9 = new Urun("9","Ampul");
        teknoloji.urunEkle(marketUrun9);
        Urun marketUrun10 = new Urun("10","USB");
        teknoloji.urunEkle(marketUrun10);
    }
    public void start() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("--------------------------------------");
            System.out.println("Market Yönetim Sistemi'ne Hoşgeldiniz!");
            System.out.println("--------------------------------------");
            System.out.println("1-Personel Girişi");
            System.out.println("2-Müşteri Girişi");
            System.out.println("0-Çıkış Yap");
            try {
                System.out.print("Seçiminiz:");
                int secim = input.nextInt();

                switch (secim) {
                    case 1:
                        personelGirisi();
                        break;
                    case 2:
                        musteriGirisi();
                        break;
                    case 0:
                        System.out.println("Çıkış Yapılıyor...");
                        return;
                    default:
                        System.out.println("Hatalı bir seçim yaptınız.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Hatalı bir giriş yaptınız. Lütfen geçerli bir sayı giriniz.");
                input.nextLine();
            }

        }
    }

    public void personelGirisi() {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("Personel Işlemleri");
        System.out.println("--------------------------------------");
        while (true) {
            System.out.println("1-Ürün Ekleme");
            System.out.println("2-Ürün Silme");
            System.out.println("3-Ürün Güncelleme");
            System.out.println("4-Ürün Listleme");
            System.out.println("0-Çıkış");
            try {
                System.out.print("Seçiminiz:");
                int secim = input.nextInt();

                switch (secim) {
                    case 1:
                        urunEkle();
                        break;
                    case 2:
                        urunSil();
                        break;
                    case 3:
                        urunGuncelle();
                        break;
                    case 4:
                        urunListele();
                        break;
                    case 0:
                        System.out.println("Çıkış Yapılıyor...");
                        return;
                    default:
                        System.out.println("Hatalı bir seçim yaptınız.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Hatalı bir giriş yaptınız. Lütfen geçerli bir sayı giriniz.");
                input.nextLine();
            }
        }
    }

    public void musteriGirisi(){
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("Müşteri Işlemleri");
        System.out.println("--------------------------------------");
        while (true) {
            System.out.println("1-Sepete Ürün Ekleme");
            System.out.println("2-Sepetten Ürün Çıkarma");
            System.out.println("3-Sepeti Listele");
            System.out.println("4-Kasa Sırası Oluşturma");
            System.out.println("0-Çıkış");
            try {
                System.out.print("Seçiminiz:");
                int secim = input.nextInt();

                switch (secim) {
                    case 1:
                        sepeteUrunEkle();
                        break;
                    case 2:
                        sepetUrunCikar();
                        break;
                    case 3:
                        //sepeti listele
                        break;
                    case 4:
                        //kasa sırası olusturma
                        break;
                    case 0:
                        System.out.println("Çıkış Yapılıyor...");
                        return;
                    default:
                        System.out.println("Hatalı bir seçim yaptınız.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Hatalı bir giriş yaptınız. Lütfen geçerli bir sayı giriniz.");
                input.nextLine();
            }
        }

    }

    public void sepeteUrunEkle() {
        Scanner input = new Scanner(System.in);

        System.out.println("1-" + gida);
        System.out.println("2-" + temizlik);
        System.out.println("3-" + teknoloji);
        System.out.print("Ürün kategorisi: ");
        int kategoriNumarasi = input.nextInt();
        String barkodNo;

        try {
            switch (kategoriNumarasi){
                case 1:
                    input.nextLine();
                    System.out.print("Ürün barkod no: ");
                    barkodNo = input.nextLine();
                    if (Urun.findUrunByBarkodNo(gida, barkodNo) != null) {
                        Urun gidaEklenenUrun = Urun.findUrunByBarkodNo(gida, barkodNo);
                        sepet.push(gidaEklenenUrun);
                        System.out.println("Ürün başarıyla eklendi.");
                    } else {
                        System.out.println("Bu barkod numarasına sahip bir ürün bulunamadı.");
                    }
                    break;
                case 2:
                    input.nextLine();
                    System.out.print("Ürün barkod no: ");
                    barkodNo = input.nextLine();
                    if (Urun.findUrunByBarkodNo(temizlik, barkodNo) != null) {
                        Urun temizlikEklenenUrun = Urun.findUrunByBarkodNo(temizlik, barkodNo);
                        sepet.push(temizlikEklenenUrun);
                        System.out.println("Ürün başarıyla eklendi.");
                    } else {
                        System.out.println("Bu barkod numarasına sahip bir ürün bulunamadı.");
                    }
                    break;
                case 3:
                    input.nextLine();
                    System.out.print("Ürün barkod no: ");
                    barkodNo = input.nextLine();
                    if (Urun.findUrunByBarkodNo(temizlik, barkodNo) != null) {
                        Urun teknolojiEklenenUrun = Urun.findUrunByBarkodNo(teknoloji, barkodNo);
                        sepet.push(teknolojiEklenenUrun);
                        System.out.println("Ürün başarıyla eklendi.");
                    } else {
                        System.out.println("Bu barkod numarasına sahip bir ürün bulunamadı.");
                    }
                    break;
                default:
                    System.out.println("Hatalı bir seçim yaptınız.");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Hatalı bir giriş yaptınız. Lütfen geçerli bir sayı giriniz.");
            input.nextLine();
        }
        System.out.println("--------------------------------------");
    }


    public void sepetUrunCikar(){
        System.out.println("--------------------------------------");
        System.out.println("Sepete en son eklenen ürün çıkarılıyor...");

        if (!sepet.isEmpty()){

            sepet.pop();
            //System.out.println(cikarilacakUrun + " Sepetten çıkarılmıştır.");
        } else {
            System.out.println("Sepette ürün olduğundan emin olunuz.");
        }
        System.out.println("--------------------------------------");
    }



    public void urunEkle() {
        System.out.println("--------------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Ürün ekleme işlemi:");
        System.out.println("--------------------------------------");
        System.out.println("1-" + gida);
        System.out.println("2-" + temizlik);
        System.out.println("3-" + teknoloji);
        System.out.print("Ürün kategorisi: ");
        int kategoriNumarasi = input.nextInt();
        try {
            switch (kategoriNumarasi){
                case 1:
                    input.nextLine();
                    System.out.print("Ürün barkod no: ");
                    String barkodNo = input.nextLine();
                    System.out.print("Ürün adı: ");
                    String urunAdi = input.nextLine();

                    Urun urun1 = new Urun(barkodNo, urunAdi);
                    gida.urunEkle(urun1);
                    System.out.println("Ürün başarıyla eklendi.");
                    break;
                case 2:
                    input.nextLine();
                    System.out.print("Ürün barkod no: ");
                    barkodNo = input.nextLine();
                    System.out.print("Ürün adı: ");
                    urunAdi = input.nextLine();

                    Urun urun2 = new Urun(barkodNo, urunAdi);
                    temizlik.urunEkle(urun2);
                    System.out.println("Ürün başarıyla eklendi.");
                    break;
                case 3:
                    input.nextLine();
                    System.out.print("Ürün barkod no: ");
                    barkodNo = input.nextLine();
                    System.out.print("Ürün adı: ");
                    urunAdi = input.nextLine();

                    Urun urun3 = new Urun(barkodNo, urunAdi);
                    teknoloji.urunEkle(urun3);
                    System.out.println("Ürün başarıyla eklendi.");
                    break;
                default:
                    System.out.println("Hatalı bir seçim yaptınız.");
                    break;
            }
        } catch (InputMismatchException e) {
        System.out.println("Hatalı bir giriş yaptınız. Lütfen geçerli bir sayı giriniz.");
        input.nextLine();
    }
        System.out.println("--------------------------------------");


    }

    public void urunSil() {
        System.out.println("--------------------------------------");
        System.out.println("Urun Silme Işlemi:");
        System.out.println("--------------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("1-" + gida);
        System.out.println("2-" + temizlik);
        System.out.println("3-" + teknoloji);
        System.out.print("Ürün kategorisi: ");
        int kategoriNumarasi = input.nextInt();
        try {
            switch (kategoriNumarasi){
                case 1:
                    input.nextLine();
                    System.out.print("Silinecek ürün barkod no: ");
                    String barkodNo = input.nextLine();

                    gida.urunSil(Urun.findUrunByBarkodNo(gida,barkodNo));
                    System.out.println("Ürün başarıyla silindi.");
                    break;
                case 2:
                    input.nextLine();
                    System.out.print("Silinecek ürün barkod no: ");
                    barkodNo = input.nextLine();


                    temizlik.urunSil(Urun.findUrunByBarkodNo(temizlik,barkodNo));
                    System.out.println("Ürün başarıyla silindi.");
                    break;
                case 3:
                    input.nextLine();
                    System.out.print("Silinecek ürün barkod no: ");
                    barkodNo = input.nextLine();

                    teknoloji.urunSil(Urun.findUrunByBarkodNo(teknoloji,barkodNo));
                    System.out.println("Ürün başarıyla silindi.");
                    break;
                default:
                    System.out.println("Hatalı bir seçim yaptınız.");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Hatalı bir giriş yaptınız. Lütfen geçerli bir sayı giriniz.");
            input.nextLine();
        }
        System.out.println("--------------------------------------");

    }

    public void urunListele(){
        System.out.println("--------------------------------------");
        System.out.println("Ürünlerin Listesi:");
        try {
            if (gida != null) {
                gida.urunleriListele();
            }
            if (temizlik != null) {
                temizlik.urunleriListele();
            }
            if (teknoloji != null) {
                teknoloji.urunleriListele();
            }
        } catch (NullPointerException e) {
            System.out.println("Listelenebilecel Ürün Yok.");
        }
        System.out.println("--------------------------------------");
    }


    public void urunGuncelle(){
        System.out.println("--------------------------------------");
        System.out.println("Urun Güncelleme Işlemi:");
        System.out.println("--------------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("1-" + gida);
        System.out.println("2-" + temizlik);
        System.out.println("3-" + teknoloji);
        System.out.print("Ürün kategorisi: ");
        int kategoriNumarasi = input.nextInt();
        try {
            switch (kategoriNumarasi){
                case 1:
                    input.nextLine();
                    System.out.print("Güncellencek Ürün Barkod No: ");
                    String barkodNo = input.nextLine();

                    System.out.print("Güncel Ürün Adı:");
                    String guncelGidaAdi= input.nextLine();

                    gida.urunGuncelle(barkodNo,guncelGidaAdi);

                    break;
                case 2:
                    input.nextLine();
                    System.out.print("Güncellencek Ürün Barkod No: ");
                    barkodNo = input.nextLine();

                    System.out.print("Güncel Ürün Adı:");
                    String guncelTemizlikAdi= input.nextLine();


                    temizlik.urunGuncelle(barkodNo,guncelTemizlikAdi);

                    break;
                case 3:
                    input.nextLine();
                    System.out.print("Güncellencek Ürün Barkod No: ");
                    barkodNo = input.nextLine();

                    System.out.print("Güncel Ürün Adı:");
                    String guncelTeknolojiAdi= input.nextLine();

                    teknoloji.urunGuncelle(barkodNo,guncelTeknolojiAdi);

                    break;
                default:
                    System.out.println("Hatalı bir seçim yaptınız.");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Hatalı bir giriş yaptınız. Lütfen geçerli bir sayı giriniz.");
            input.nextLine();
        }
        System.out.println("--------------------------------------");


    }


}