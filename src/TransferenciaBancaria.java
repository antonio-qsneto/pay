public class TransferenciaBancaria implements pagamento{
    private String contaBancaria;
    private Double saldo = 2000.0;

    public String getContaBancaria() {
        return contaBancaria;
    }
    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    @Override
    public void pagar(Double valor) {
        if (valor > saldo){
            System.out.println("\n(Transferencia Bancaria) A tentativa de pagamento falhou, tente novamente. ");
        } else {
            saldo -= valor;
            System.out.println("\n(Transferencia Bancaria) TENTATIVA REALIZADA COM SUCESSO - Valor Restante: " + saldo);
        }
    }
}
