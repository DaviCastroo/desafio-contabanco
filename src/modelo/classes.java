package modelo;
import java.security.SecureRandom;
import java.util.Scanner;

public class classes {
    
    public class contaBancaria{
        public String NomeCliente;
        private int numeroConta;
        private String Agencia;
        private double Saldo;
        
        public contaBancaria(String NomeCliente){
            this.NomeCliente= NomeCliente;
            this.numeroConta= gerarNumeroConta();
            this.Agencia= gerarAgencia();
            this.Saldo= 0.0;
        }
            private int gerarNumeroConta(){
                SecureRandom random = new SecureRandom();
                return random.nextInt(9999) + 1000;
            }
            
            private String gerarAgencia(){
                    SecureRandom random = new SecureRandom();
                    int numeroBase = random.nextInt(9999) + 1000;
                    int numeroVerificador = random.nextInt(10);
                return numeroBase + "-" + numeroVerificador; 
            }
    }
    private static void criarNovaConta() {
       
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o nome do cliente: ");
       
        String nomeCliente = scanner.nextLine();
        contaBancaria novaConta = new classes().new contaBancaria(nomeCliente); // Instancia uma nova conta
        scanner.close();        
            System.out.println("Conta criada com sucesso!");
            System.out.println("Nome: " + novaConta.NomeCliente);
            System.out.println("Agência: " + novaConta.Agencia);
            System.out.println("Número da Conta: " + novaConta.numeroConta);
            System.out.println("Saldo: " + novaConta.Saldo);
    }
    public static boolean opcoes (Scanner scanner) {
        int numOpcao = scanner.nextInt();    
        switch (numOpcao) {
                case 1:
                    System.out.println("\n Criando uma nova conta...");
                    criarNovaConta();
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
       