
package conta;

public class ContaCorrente extends Conta{
    private double limite;
    
    public ContaCorrente(String numeroConta, String nomeCliente, String cpf,
            double saldo, float limite){
        super(numeroConta, nomeCliente, cpf, saldo);
        this.limite = limite;
    }
    
    public boolean usandoLimite(float valor){
        if()
    }
}
