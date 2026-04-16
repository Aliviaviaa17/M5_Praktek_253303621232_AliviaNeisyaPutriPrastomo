public class MainGateway {
    public static void main(String[] args) {
        // Upcasting: Objek anak disimpan dalam tipe data Bapak (Payment)
        Payment[] payments = {
            new EWallet(),
            new CreditCard()
        };

        System.out.println("--- SISTEM PEMBAYARAN UNPRISHOP ---");

        for (Payment p : payments) {
            // Polimorfisme: Memanggil method yang sama, tapi perilaku berbeda tergantung wujud aslinya
            p.process(100000);

            // Cek wujud asli dengan instanceof (Downcasting)
            if (p instanceof EWallet) {
                EWallet dompetDigital = (EWallet) p; // Proses Downcasting
                dompetDigital.inputPin();
            }
            
            System.out.println("-----------------------------------");
        }
    }
} 