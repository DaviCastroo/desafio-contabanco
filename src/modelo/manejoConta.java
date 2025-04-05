package modelo;
import java.security.SecureRandom;
import java.util.Scanner;

public class manejoConta {
    
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
    
    public static void criarNovaConta() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o nome do cliente: ");
            String nomeCliente = scanner.nextLine();
        
        contaBancaria novaConta = new manejoConta().new contaBancaria(nomeCliente); 
                
            System.out.println("Conta criada com sucesso!");
            System.out.println("Nome: " + novaConta.NomeCliente);
            System.out.println("Agência: " + novaConta.Agencia);
            System.out.println("Número da Conta: " + novaConta.numeroConta);
            System.out.println("Saldo: " + novaConta.Saldo);
    }

    
}
       