package modelo;

import java.util.Scanner;

public class menu {

    public static boolean opcoes (Scanner scanner) {
        int numOpcao = scanner.nextInt();    
        switch (numOpcao) {
                case 1:
                    System.out.println("\n Criando uma nova conta...");
                    manejoConta.criarNovaConta();
                    break;
                case 2:
                    System.out.println("\n Excluindo conta...");
                    break;
                case 3:
                    System.out.println("\n Consultando saldo...");
                    break;
                case 4:
                    System.out.println("\n Depósito em andamento...");
                    break;
                case 5:
                    System.out.println("\n Realizando saque...");
                    break;
                case 6:
                    System.out.println("\n Saindo do sistema... Até mais!");
                    return false;
                default:
                    System.out.println("\n Opção inválida! Tente novamente.");
                    break;
                }
                return true;
    } 
}
