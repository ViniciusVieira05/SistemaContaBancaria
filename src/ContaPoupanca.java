// Classe que representa uma Conta Poupança
public class ContaPoupanca extends ContaBancaria{

    // Construtor da Conta Poupança
    public ContaPoupanca(int numeroConta, String titular, double saldo){
        super(numeroConta, titular, saldo);
    }

    // Saque permitido apenas se houver saldo suficiente
    @Override
    public void sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
        }
        else{
            System.out.println("Saldo insuficiente para saque!!!");
        }
    }

    // Depósito com validação de valor negativo
    @Override
    public void depositar(double valor){
        if(valor < 0){
            System.out.println("Você não pode depositar um valor negativo");
        }
        else{
            saldo += valor;
        }
    }

    // Método exclusivo da Conta Poupança para aplicar juros
    public void renderJuros(double porcentagem){
        saldo += (saldo * porcentagem / 100);
    }

    // Exibe os dados da Conta Poupança
    @Override
    public void exibirDadosConta(){
        System.out.println("\n------------------------------------------");
        System.out.println("Conta Poupança: ");
        System.out.println("Nome do Titular da Conta: " +getTitular());
        System.out.println("Número da Conta: " + getNumeroConta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("------------------------------------------");


    }
}
