import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Conhecer e importar a classe Scanner
        Scanner input = new Scanner(System.in);

        // Exibir as mensagens para o usuário
        // Obter pela Scanner os valores digitados no Terminal
        System.out.println("Digite o seu nome:");
        String nomeCliente = input.nextLine();

        System.out.println("Digite o número de sua agência:");
        String agencia = input.nextLine();

        System.out.println("Digite o número de sua conta:");
        int numeroConta = input.nextInt();

        System.out.println("Digite o seu saldo:");
        double saldo = input.nextDouble();

        // Exibir a mensagem da conta criada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);
    }
}
