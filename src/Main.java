import modelo.menu;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;
        
        while (executando) {
            exibirMenu();
            System.out.println("Escolha uma opção:");
            executando = menu.opcoes(scanner);
        }
       
        scanner.close();
        System.out.println("Sistema encerrado, até mais!");
    }
    private static void exibirMenu() {
        System.out.println("----------------------------");
        System.out.println("|      MENU PRINCIPAL      |");
        System.out.println("----------------------------");
        System.out.println("| 1. Criar Nova Conta      |");
        System.out.println("| 2. Excluir Conta         |");
        System.out.println("| 3. Consultar Saldo       |");
        System.out.println("| 4. Depositar             |");
        System.out.println("| 5. Sacar                 |");
        System.out.println("| 6. Sair                  |");
        System.out.println("----------------------------");
    }
}
