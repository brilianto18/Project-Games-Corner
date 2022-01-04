package project4last;

public class Beligame {
    
    String Namagame = "GTA San Andreas";
    String Namap = "Iqbal Prakasa Utomo";
    String Email = "iqbxklgmail.com";
    int hargag, uang;
    
    float total(){
        int total = hargag;
        int kembalian = uang - total;    
        
        System.out.println("Selamat datang di GamesCorner !");
        System.out.println("Ingin membeli game apa? " +Namagame);
        System.out.println("Atas nama siapa? " +Namap);
        System.out.println("Total harga game tersebut adalah : " +total+ "k");
        System.out.println("Masukkan nominal uang anda : " +uang+ "k");
        System.out.println("Terima kasih telah melakukan pembayaran !");
        System.out.println("Uang kembalian anda sebesar : " +kembalian+ "k");
        System.out.println("===============================================================================");
        
        return total;
    }
    
}
