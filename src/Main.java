public class Main {
    public static void main(String[] args) {
        System.out.println("  __  __            _        _ ");
        System.out.println(" |  \\/  | __ _ _ __| | _____| |_ ");
        System.out.println(" | |\\/| |/ _` | '__| |/ / _ \\ __|");
        System.out.println(" | |  | | (_| | |  |   <  __/ |_");
        System.out.println(" |_|  |_|\\__,_|_|  |_|\\_\\___|\\__|");
        System.out.println("                                 ");
        Panel panel = new Panel();
        panel.marketUrunleriOlustur();
        panel.musteriOlustur();
        panel.start();


    }
}