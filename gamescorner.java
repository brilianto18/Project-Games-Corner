package project4last;

public class gamescorner {

    public static void main(String[] args) {
        Rentalgame rental = new Rentalgame();
        
        rental.harian = 20;
        rental.durasi = 15;
        rental.uang = 320;
        
        Beligame beli = new Beligame();
        
        beli.uang = 550;
        beli.hargag = 530;
        
        beli.total();  
        rental.total();
    }
    
}
