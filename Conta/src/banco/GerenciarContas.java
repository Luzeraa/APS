package banco;

import java.util.ArrayList;
 
public class GerenciarContas {

    private ArrayList<Conta> lista = new ArrayList<>();

    public void adicionarConta(Conta c) {
        lista.add(c);
    }
 
    public boolean removerConta(int numeroConta) {
        for (Conta conta : lista) {
            if (numeroConta == conta.getNumeroConta()) {
                lista.remove(conta);
            }
            return true;
        }
        return false;
    }

    public String buscarContaEspecial() {
        String ce;
        int contador = 0;
        for (Conta conta : lista) {
            contador++;
            if (conta instanceof ContaEspecial) {
                ce = conta.imprimir();
                return "O total de contas especiais eh" + contador + "\n"
                        + ce;
            }
        }
        return "O total de contas especiais eh" + contador;
    }

    public String buscarClientesUsandoLimite() {
        String ce;
        int contador = 0;
        for (Conta conta : lista) {
            contador++;
            if (conta instanceof ContaCorrente) {
                ce = conta.imprimir();
                return "O total de contas corrente eh: " + contador + "\n"
                        + ce;
            }
        }
        return "O total de contas corrente eh: " + contador;
    }

    public Conta buscarConta(int numeroConta) {
        for (Conta conta : lista) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    public boolean transferirValor(int numeroContaOrigem, int numeroContaDestino,
            float valor) {

        Conta c1 = buscarConta(numeroContaOrigem);
        Conta c2 = buscarConta(numeroContaDestino);
        if (c1 != null && c2 != null) {
            if (c1.getSaldo() >= valor) {
                if (c1 instanceof ContaCorrente) {
                    c1.sacar(valor);
                    c2.depositar(valor);
                } else {
                    c1.sacar(valor);
                    c2.depositar(valor);
                }
                return true;
            }

        }
        return false;
    }

    public boolean sacar(int numeroConta, float valorSacado) {
        Conta c = buscarConta(numeroConta);

        if (c != null) {
            c.sacar(valorSacado);
            return true;
        }
        return false;

    }

    public boolean depositar(int numeroConta, float valorDepositado) {
        Conta c = buscarConta(numeroConta);

        if (c != null) {
            c.depositar(valorDepositado);
            return true;
        }
        return false;
    }

    public String listarContas() {
        for (Conta conta : lista) {
            return conta.imprimir();
        }
        return null;
    }

}
