package banco;

public class ContaEspecial extends ContaCorrente {
    private String gerenteResponsavel;

    public ContaEspecial(String numeroConta, String nomeCliente, String cpf, String gerenteResponsavel) {
        super(numeroConta, nomeCliente, cpf);      
        this.gerenteResponsavel = gerenteResponsavel;
    }
    
    public ContaEspecial(String numeroConta, String nomeCliente, String cpf, String gerenteResponsavel,
                        float limite) {
        super(numeroConta, nomeCliente, cpf, limite);      
        this.gerenteResponsavel = gerenteResponsavel;
    }


    
    public String getGerenteResponsavel() {
        return gerenteResponsavel;
    }

    public void setGerenteResponsavel(String gerenteResponsavel) {
        this.gerenteResponsavel = gerenteResponsavel;
    }
    
    
     @Override
    public String imprimir(){
        return "Titular: " + getNomeCliente() + "Nº conta: " + getNumeroConta() +"\n"
        + "CPF: " + getCpf() + "Saldo: " + getSaldo() + "Limite: " + getLimite() + "\n"
                + "Gerente responsável: " + gerenteResponsavel;
    }
    
    
    
}
