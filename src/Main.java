import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner para entrada de dados do usuário
        Scanner sc = new Scanner(System.in);

        // Criação de uma conta corrente
        ContaCorrente contaCorrente = new ContaCorrente(938362, "Vinicius Vieira", 0.0, 300);

        // Exibe os dados iniciais
        contaCorrente.exibirDadosConta();

        // Depósito feito pelo usuário
        System.out.println("Valor a Depositar: ");
        int valor = sc.nextInt();
        contaCorrente.depositar(valor);

        // Exibe os dados após o depósito
        contaCorrente.exibirDadosConta();

        // Saque feito pelo usuário
        System.out.println("Valor a sacar: ");
        double valorSaque = sc.nextDouble();
        contaCorrente.sacar(valorSaque);

        // Exibe os dados finais após o saque
        System.out.println("\nDados atualizados após o saque:");
        contaCorrente.exibirDadosConta();

        // Fecha o scanner
        sc.close();
    }
}