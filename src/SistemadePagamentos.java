public class SistemadePagamentos {
    public static void main(String[] args) throws Exception {
        CartaoCredito c1 = new CartaoCredito("123456-5", "Joao", "06/26", "856");
        Paypal p1 = new Paypal();
        TransferenciaBancaria t1 = new TransferenciaBancaria();

        p1.setEmail("joao@gmail.com");
        t1.setContaBancaria("6789-54");

        c1.pagar(1000000.0);
        c1.pagar(100.0);

        p1.pagar(1000.0);
        p1.pagar(10.0);

        t1.pagar(100000.0);
        t1.pagar(10.0);

    }
}
