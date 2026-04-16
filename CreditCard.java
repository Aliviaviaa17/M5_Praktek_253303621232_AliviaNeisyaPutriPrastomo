public class CreditCard extends Payment {
    @Override
    public void process(int amount) {
        System.out.println("Menghubungi Bank... Memotong Kartu Kredit Rp " + amount + "... Suksess!");
    }
}