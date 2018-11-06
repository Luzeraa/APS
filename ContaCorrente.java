package banco;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(String numeroConta, String nomeCliente, String cpf,
                         double saldo) {
        super(numeroConta, nomeCliente, cpf, saldo);      
    }
    
    public ContaCorrente(String numeroConta, String nomeCliente, String cpf,
                         double saldo, float limite) {
        super(numeroConta, nomeCliente, cpf, saldo);
        this.limite = limite;
    }
    
    
    @Override
    public boolean sacar(float valor){ 
       if((valor <= (super.getSaldo()+ limite) ) ){
            super.sacar(valor);
            return true;
       }else{
           return false;
       }
    }
       
    
    @Override
    public String imprimir(){
        return "Titular: " + getNomeCliente() + "Nº conta: " + getNumeroConta() +"\n"
        + "CPF: " + getCpf() + "Saldo: " + getSaldo() + "Limite: " + limite;
    }

    
    @Override
    public String getNumeroConta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public boolean usandoLimite(float saque){
        if(sacar(saque) == true){
            return true;
        }else{
            return false;
        }
    }


}
