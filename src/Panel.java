import java.util.Scanner;
import java.util.InputMismatchException;
public class Panel {




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

    public void personelGirisi(){
        while (true){
            System.out.println("1-Ürün Ekleme");
            System.out.println("2-Ürün Silme");
            System.out.println("3-Ürün Güncelleme");
        }
    }






}
