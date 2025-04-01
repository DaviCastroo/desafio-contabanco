import modelo.classes;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("----------------------------");
        System.out.println("|      MENU PRINCIPAL      |");
        System.out.println("----------------------------");
        System.out.println("| 1. Criar Nova Conta      |");
        System.out.println("| 2. Excluir Conta         |");
        System.out.println("| 3. Consultar Saldo       |");
        System.out.println("| 4. Depositar             |");
        System.out.println("| 5. Transferência         |");
        System.out.println("| 6. Sair                  |");
        System.out.println("----------------------------");
        System.out.print("Escolha uma opção: ");
        
        classes.opcoes(scanner);

    scanner.close();
    }
}
