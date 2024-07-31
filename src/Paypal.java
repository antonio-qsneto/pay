public class Paypal implements pagamento{
    private String email;
    private Double saldo = 500.0;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void pagar(Double valor) {
        if (valor > saldo){
            System.out.println("\n(Paypal) A tentativa de pagamento falhou, tente novamente. ");
        } else {
            saldo -= valor;
            System.out.println("\n(Paypal) TENTATIVA REALIZADA COM SUCESSO - Valor Restante: " + saldo);
        }
    }

}
