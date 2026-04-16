public class MainGateway {
    public static void main(String[] args) {

        // Upcasting
        Payment[] payments = new Payment[2];
        payments[0] = new EWallet();
        payments[1] = new CreditCard();

        // Looping + Polymorphism
        for (Payment p : payments) {
            p.process(100000);

            // Downcasting dengan instanceof
            if (p instanceof EWallet) {
                EWallet e = (EWallet) p;
                e.inputPin();
            }
        }
    }
}