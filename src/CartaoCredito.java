public class CartaoCredito implements pagamento{
    private String numeroCartao;
    private String nomeTitular;
    private String dataValidade;
    private String codSegurança;
    private Double linhaCredito = 1000.0; 
    
    public CartaoCredito(String numeroCartao, String nomeTitular, String dataValidade, String codSeguranca){
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.dataValidade = dataValidade;
        this.codSegurança = codSeguranca;

    }

    public String getCodSegurança() {
        return codSegurança;
    }
    public String getDataValidade() {
        return dataValidade;
    }
    public Double getLinhaCredito() {
        return linhaCredito;
    }
    public String getNomeTitular() {
        return nomeTitular;
    }
    public String getNumeroCartao() {
        return numeroCartao;
    }

    @Override
    public void pagar(Double valor) {
        if (valor > linhaCredito){
            System.out.println("\n(Credito) A tentativa de pagamento falhou, tente novamente. ");
        } else {
            linhaCredito -= valor;
            System.out.println("\n(Credito) TENTATIVA REALIZADA COM SUCESSO - Valor Restante: " + linhaCredito);
        }
        
    }

}
