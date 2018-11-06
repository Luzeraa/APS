package banco;


public class ContaPoupança extends Conta {
    
    
     public ContaPoupança(String numeroConta, String nomeCliente, String cpf,
                         float saldo) {
        super(numeroConta, nomeCliente, cpf, saldo);      
    }
    
    public void calculaRendimento(float porcentagem){
        float rendimento;
        rendimento = super.getSaldo() * porcentagem;
        System.out.println("O rendimento eh de: " + rendimento);
    }    
}
