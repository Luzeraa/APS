package banco;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(String numeroConta, String nomeCliente, String cpf) {
        super(numeroConta, nomeCliente, cpf);      
    }
    
    public ContaCorrente(String numeroConta, String nomeCliente, String cpf, float limite) {
        super(numeroConta, nomeCliente, cpf);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }
 
    public void setLimite(double limite) {
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
    public String getNumeroConta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String imprimir(){
        return "Titular: " + getNomeCliente() + "Nº conta: " + getNumeroConta() +"\n"
        + "CPF: " + getCpf() + "Saldo: " + getSaldo() + "Limite: " + limite;
    }
    
    public boolean usandoLimite(float saque){
        if(sacar(saque) == true){
            return true;
        }else{
            return false;
        }
    }


}
