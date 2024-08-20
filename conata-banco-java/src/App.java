import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal(null, null, null, null);


        System.out.println("Por favor, digite o número da sua agência: ");
        String agencia;
        agencia = scanner.nextLine();
        contaTerminal.setAgencia(agencia);

        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();
        contaTerminal.setNumero(numero);

        System.out.println("Usuário: " + contaTerminal.getNumero());
        scanner.nextLine();
        System.out.println("Digite o nome completo: ");
        String nomeCompleto = scanner.nextLine();
        contaTerminal.setNomeCompleto(nomeCompleto);

        System.out.println("Olá " + contaTerminal.getNomeCompleto() + ", obrigado por criar um conta no nosso banco, sua agência é " + 
                            contaTerminal.getAgencia() + ", conta " + contaTerminal.getNumero() + " e seu saldo "+ 
                            contaTerminal.getSaldo() + " está disponível para saque");

        

        
    }
}
