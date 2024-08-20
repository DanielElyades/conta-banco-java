public class ContaTerminal {

    private Integer numero;
    private String agencia;
    private String nomeCompleto;
    private Double saldo;
   
    public ContaTerminal(Integer numero, String agencia, String nomeCompleto, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCompleto = nomeCompleto;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    



}