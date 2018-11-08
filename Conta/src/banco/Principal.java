package banco;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int opcaoConta = 0;

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
            opcaoConta = ler.nextInt();

            switch (opcaoConta) {
                
                    
            }

        } while (opcaoConta != 0);
    }
}
