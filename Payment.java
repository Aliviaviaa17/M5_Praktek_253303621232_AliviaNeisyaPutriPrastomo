public class Payment {

    // Method utama
    public void process(int amount) {
        System.out.println("Memproses pembayaran umum: Rp " + amount);
    }

    // Method Overloading
    public void process(int amount, String promoCode) {
        System.out.println("Memproses pembayaran: Rp " + amount + " dengan diskon kode " + promoCode);
    }
}