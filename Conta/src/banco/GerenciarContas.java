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
 
   public boolean transferirValor(int numeroContaOrigem,int numeroContaDestino,
                                  double valor){

       for (Conta conta : lista) {
           if(conta.getNumeroConta() == numeroContaOrigem){
               
           }
       }
   }























}
    
 