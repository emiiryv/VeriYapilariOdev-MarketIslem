import java.util.Scanner;
import java.util.InputMismatchException;

public class Panel {
    Kategori gida = new Kategori("Gıda Ürünleri");
    Kategori temizlik = new Kategori("Temizlik Ürünleri");
    Kategori teknoloji = new Kategori("Teknoloji Ürünleri");
    public void start() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Market Yönetim Sistemi'ne Hoşgeldiniz!");
            System.out.println("#######################################");
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
                        // Müşteri girişi işlemleri buraya gelebilir
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
        while (true) {
            System.out.println("1-Ürün Ekleme");
            System.out.println("2-Ürün Silme");
            System.out.println("3-Ürün Güncelleme");
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
                        // Ürün güncelleme işlemleri buraya gelebilir
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

    public void urunEkle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ürün ekleme işlemi:");
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



    }

    public void urunSil() {
        // Urun silme işlemleri buraya gelebilir
        System.out.println("Urun silme işlemleri...");
    }
}