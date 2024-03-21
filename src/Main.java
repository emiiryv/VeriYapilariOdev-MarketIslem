public class Main {
    public static void main(String[] args) {
        Panel panel = new Panel();
        panel.marketUrunleriOlustur();
        panel.start();
        //Aynı barkod no ile aynı kategoriye ürün eklenebiliyor
        //Personel kısmından listele dediğmizde görünmüyor ancak
        //müşteri kısmında ürün ekleme listesinde görünüyor
        //sepet listele ve kasa sırası eklenecek
    }
}