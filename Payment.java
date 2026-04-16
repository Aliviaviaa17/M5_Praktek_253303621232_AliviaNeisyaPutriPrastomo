public class Payment {
    // Method dasar
    public void process(int amount) {
        System.out.println("Memproses pembayaran umum: Rp " + amount);
    }

    // Overloading: Menambahkan parameter promoCode
    public void process(int amount, String promoCode) {
        System.out.println("Memproses pembayaran: Rp " + amount + " dengan diskon kode " + promoCode);
    }
}