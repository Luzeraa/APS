package banco;
    
public abstract class Conta {
 
    private int numeroConta;
    private String nomeCliente;
    private String cpf;
    private float saldo;
 
    public Conta() {
        this.numeroConta = 0;
        this.nomeCliente = "Nao informado";
        this.cpf = "Nao informado";
    }

    public Conta(int numeroConta, String nomeCliente, String cpf) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    private void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSaldo() {
        return saldo;
    }

    private void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(float valor) {
        if ((saldo - valor) >= 0) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(float valor) {
        if (valor >= 0) {
            saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    public String imprimir() {
        return "Titular: " + nomeCliente + "\n Nº conta: " + numeroConta + "\n"
                + " CPF: " + cpf + "\n Saldo: " + saldo + "\n";
    }
}
