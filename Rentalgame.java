package project4last;

public class Rentalgame {
    
    String Namagame = "GTA V";
    String Namap = "Didi Haryanto";
    String Email = "didiganteng@gmail.com";
    int harian, durasi, uang;
    
    float total(){
        int total = harian * durasi;
        int kembalian = uang - total;    
        
        System.out.println("Selamat datang di GamesCorner !");
        System.out.println("Ingin merental game apa? " + Namagame);
        System.out.println("Atas nama siapa? " + Namap);
        System.out.println("Ingin merental berapa lama? " + durasi+ " hari");
        System.out.println("Harga rental per harinya adalah : " + harian+ "k");
        System.out.println("Total Harga apabila anda ingin merental selama " + durasi + " hari adalah sebesar : " + total+ "k");
        System.out.println("Masukkan nominal uang anda : " + uang+ "k");
        System.out.println("Terima kasih telah melakukan pembayaran !");
        System.out.println("Uang kembalian anda sebesar : " + kembalian+ "k");
        System.out.println("===============================================================================");
        
        return total;
    }
    
    
}
