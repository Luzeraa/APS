package banco;


public class ContaPoupança extends Conta {
    
    
     public ContaPoupança(int numeroConta, String nomeCliente, String cpf) {
        super(numeroConta, nomeCliente, cpf);      
    }
      
    public void calculaRendimento(float porcentagem){
        float rendimento;
        rendimento = super.getSaldo() * porcentagem;
        System.out.println("O rendimento eh de: " + rendimento);
    }    
}
