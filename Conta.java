package banco;

public abstract class Conta {

    private String numeroConta;
    private String nomeCliente;
    private String cpf;
    private float saldo;

    public Conta() {
        this.numeroConta = "Nao informado";
        this.nomeCliente = "Nao informado";
        this.cpf = "Nao informado";
    }

    public Conta(String numeroConta, String nomeCliente, String cpf, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
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
        return "Titular: " + nomeCliente + "Nº conta: " + numeroConta + "\n"
                + "CPF: " + cpf + "Saldo: " + saldo;
    }
}
