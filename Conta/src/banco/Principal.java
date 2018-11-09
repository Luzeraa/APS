package banco;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao = 0, opcaoConta = 0;
        int numeroConta;
        String nomeCliente, cpf, gerenteResponsavel;
        float limite;

        do {
             
            System.out.println("Digite a opção desejada: \n"
                    + "(1)  Adicionar conta \n"
                    + "(2)  Remover Conta\n"
                    + "(3)  Buscar Contas Especiais\n"
                    + "(4)  Buscar clientes utilizando o limite\n"
                    + "(5)  Buscar Contas \n"
                    + "(6)  Transferir valor \n"
                    + "(7)  Sacar\n"
                    + "(8)  Depositar\n"
                    + "(9)  Listar contas \n"
                    + "(10) Finalizar operação");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Que tipo de conta deseja abrir? \n"
                            + "(1) Conta Corrente\n"
                            + "(2) Conta Especial\n"
                            + "(3) Conta Poupança\n");
                    opcaoConta = input.nextInt();
                    switch (opcaoConta){
                        case 1:
                            System.out.println("Digite o numero da conta: ");
                            input.nextLine();
                            nomeCliente = input.nextLine();
                            
                            System.out.println("Digite o nome do titular: ");
                            numeroConta = input.nextInt();
                            
                            System.out.println("Digite o CPF do titular: ");
                            input.nextLine();
                            cpf = input.nextLine();
                            
                            System.out.println("Digite o limite do titular");
                            limite = input.nextFloat();
                            
                            System.out.println("Digite o nome do gerente responsavel");
                            gerenteResponsavel = input.nextLine();
                            
                            ContaCorrente contaCorrente = new ContaCorrente(numeroConta, nomeCliente, cpf, limite, 
                                    gerenteResponsavel);
                            GerenciarContas lista = new GerenciarContas();
                            lista.adicionarConta(contaCorrente);
                            break;
                            
                            
                    }
                    break;
                    
            }

        } while (opcao != 0);
    }
}
